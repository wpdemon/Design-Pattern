package com.decorator;

public class DecoratorB extends Decorator {

	public DecoratorB(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Operation() {
		System.out.println("¾ßÌå×°ÊÎÆ÷B");
	}
}
