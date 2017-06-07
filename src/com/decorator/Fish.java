package com.decorator;

public class Fish extends Change {

	public Fish(GreatestSage sage) {
		super(sage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		System.out.println("Fish Move");
	}
	
	
}
