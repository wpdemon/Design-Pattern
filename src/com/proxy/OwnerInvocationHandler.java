package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
	PersonBean person;
	public OwnerInvocationHandler(PersonBean person) {
		// TODO Auto-generated constructor stub
		this.person=person;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		if (method.getName().startsWith("get")) {
			return method.invoke(person, args);
		}else if (method.getName().equals("setHotOrNotRating")) {//该方法不允许访问
			throw new IllegalAccessException("无访问权限");
		}else if (method.getName().startsWith("set")) {
			return method.invoke(person, args);
		}
		return null;
	}

}
