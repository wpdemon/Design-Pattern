package com.decorator;

public class Bird extends Change {

	public Bird(GreatestSage sage) {
		super(sage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		System.out.println("Bird Move");
	}

	
}
