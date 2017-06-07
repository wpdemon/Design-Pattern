package com.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> list=new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		list.add(observer);
		System.out.println("增加一个观察者");
	}
	
	public void detach(Observer observer){
		list.remove(observer);
	}
	
	public void notifyAllObservers(String newState) {
		for (Observer observer : list) {
			observer.update(this);
		}
	}
}
