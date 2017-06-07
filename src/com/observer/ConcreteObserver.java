package com.observer;

public class ConcreteObserver implements Observer {

	private String observerState;
	
	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		observerState=state;
		System.out.println("�۲���״̬Ϊ"+observerState);
	}

	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		observerState=((ConcreteSubject)subject).getState();
		System.out.println("�۲���״̬Ϊ"+observerState);
	}

}
