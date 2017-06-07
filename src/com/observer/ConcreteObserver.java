package com.observer;

public class ConcreteObserver implements Observer {

	private String observerState;
	
	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		observerState=state;
		System.out.println("观察者状态为"+observerState);
	}

	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		observerState=((ConcreteSubject)subject).getState();
		System.out.println("观察者状态为"+observerState);
	}

}
