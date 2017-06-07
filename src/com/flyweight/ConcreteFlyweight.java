package com.flyweight;

public class ConcreteFlyweight implements Flyweight {

	private Character intrinsicState = null;//����״̬
	
	public ConcreteFlyweight(Character state) {
		// TODO Auto-generated constructor stub
		this.intrinsicState=state;
	}
	
	@Override
	public void operation(String state) {//����״̬
		// TODO Auto-generated method stub
		System.out.println(this.intrinsicState);
		System.out.println(state);
	}

}
