package com.builder;

public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder=builder;
	}
	
	public void construct() {
		builder.buildPart1();
		builder.buildPart2();
	}
}
