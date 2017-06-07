package com.templatemethod;

public class TransferRunnable implements Runnable {

	private Bank bank;
	private int fromAccount;
	private double maxAmount;
	private int DELAY = 10;

	public TransferRunnable(Bank bank, int from, double max) {
		// TODO Auto-generated constructor stub
		this.bank = bank;
		this.fromAccount = from;
		this.maxAmount = max;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				int toAccount = (int) (bank.size() * Math.random());
				double amount = maxAmount * Math.random();
				bank.transfer(fromAccount, toAccount, amount);
				Thread.sleep((int)(DELAY*Math.random()));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
