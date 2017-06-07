package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TimeProxy implements InvocationHandler {
	private Object obj;
	//bind object
	public Object bind(Object obj) {
		this.obj=obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Object result=null;
		long starttime=System.nanoTime();
		result=method.invoke(obj, args);
		long endtime=System.nanoTime();
		System.out.println("the running time is "+(endtime-starttime)+"ns");
		return result;
	}

}
