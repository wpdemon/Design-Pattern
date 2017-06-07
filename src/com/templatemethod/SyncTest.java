package com.templatemethod;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RecursiveTask;


public class SyncTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(ThreadLocalRandom.current().nextInt());
		LinkedBlockingQueue<String> queue=new LinkedBlockingQueue<>();
		ConcurrentHashMap<Integer, String> map=new ConcurrentHashMap<Integer, String>();
		CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<Integer>();
		/*new Callable<V>() {

			@Override
			public V call() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		};*/
	//	FutureTask<Integer> task=new FutureTask<Integer>(null);//装饰模式
		ExecutorService pool=Executors.newFixedThreadPool(30);
		ExecutorCompletionService<?> completionService=new ExecutorCompletionService<>(pool);//收集执行结果
//		CyclicBarrier barrier=new CyclicBarrier(10);
//		barrier.await();
		map.putIfAbsent(123, "123");
		Bank bank=new Bank(100,1000);
		for (int i = 0; i < 100; i++) {
			Thread t=new Thread(new TransferRunnable(bank, i, 1000));
			t.start();
		}
	}

}
