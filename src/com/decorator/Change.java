package com.decorator;

public class Change implements GreatestSage {

	private GreatestSage sage;
	public Change(GreatestSage sage) {
		// TODO Auto-generated constructor stub
		this.sage=sage;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		sage.move();
	}

}
