package com.state;

public class StateA implements State {

	@Override
	public void handle(String sampleParameter) {
		// TODO Auto-generated method stub
		System.out.println("ConcreteStateA handle £º" + sampleParameter);
	}

}
