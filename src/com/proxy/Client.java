package com.proxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeProxy timeProxy=new TimeProxy();
		SalaryInterface salaryInterface=(SalaryInterface)timeProxy.bind(new Salary());
		salaryInterface.doSalary();
		TaxInterface taxInterface=(TaxInterface)timeProxy.bind(new Tax());
		taxInterface.doTax();
	/*	SimpleFactory factory=new SimpleFactory();
		Translate translate=factory.getTranslate(ChineseTranslate.class.getName());
		System.out.print(translate.sayText("wp"));*/
		PersonBean person=new PersonBeanImpl();
		PersonBean proxy=(PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(), new OwnerInvocationHandler(person));		
		
		System.out.println(Proxy.isProxyClass(proxy.getClass()));
	}

}
