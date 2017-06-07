package com.decorator;

public class Decorator implements Component {

	private Component component;
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		component.Operation();
	}
	
	public Decorator(Component component) {
		// TODO Auto-generated constructor stub
		this.component=component;
	}
}
