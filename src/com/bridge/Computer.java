package com.bridge;

public abstract class Computer {
	private Brand brand;
	public Computer(Brand brand) {
		// TODO Auto-generated constructor stub
		this.brand=brand;
	}
	
	public void sale() {
		brand.sale();
	}
}
