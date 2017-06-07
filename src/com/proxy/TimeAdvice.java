package com.proxy;

public class TimeAdvice implements Advice {
	
	long startime;
	long endtime;
	@Override
	public void before() {
		// TODO Auto-generated method stub
		startime=System.nanoTime();
	}

	@Override
	public void after() {
		// TODO Auto-generated method stub
		endtime=System.nanoTime();
		System.out.println("runing time is "+(endtime-startime)+"ns");
	}

}
