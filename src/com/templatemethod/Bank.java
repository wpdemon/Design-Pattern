package com.templatemethod;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Bank {
	private  Lock bankLock;
	private Condition sufficientFunds;
	private final double[] accounts;
	private ReentrantReadWriteLock rwl=new ReentrantReadWriteLock();
	private Lock readLock=rwl.readLock();
	private Lock writeLock=rwl.writeLock();

	public Bank(int n, double initBalance) {
		// TODO Auto-generated constructor stub
		accounts = new double[n];
		for (int i = 0; i < n; i++) {
			accounts[i] = initBalance;
		}
		bankLock = new ReentrantLock();
		sufficientFunds = bankLock.newCondition();
	}

	public void transfer(int from,int to,double amount) throws InterruptedException {
		bankLock.lock();
		//writeLock.lock();
		try{
			while (accounts[from]<amount) 
				sufficientFunds.await();
				//wait();
			System.out.print(Thread.currentThread());
			accounts[from]-=amount;
			System.out.printf(" %10.2f from %d to %d",amount,from,to);
			accounts[to]+=amount;
			System.out.printf(" Total Balance£º %10.2f%n",getTotalBalance());
			sufficientFunds.signalAll();
			//notifyAll();
		}finally{
			bankLock.unlock();
			//writeLock.unlock();
		}		
	}
	
	public double getTotalBalance() {
		bankLock.lock();
		//readLock.lock();
		try{
			double sum=0;
			for (double d : accounts) {
				sum+=d;
			}
			return sum;
		}finally{
			bankLock.unlock();
			//readLock.unlock();
		}
	}
	
	public int size() {
		return accounts.length;
	}
}
