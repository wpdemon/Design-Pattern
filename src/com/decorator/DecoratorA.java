package com.decorator;

public class DecoratorA extends Decorator{

	public DecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void Operation() {
		System.out.println("¾ßÌå×°ÊÎÆ÷A");
	}

}
