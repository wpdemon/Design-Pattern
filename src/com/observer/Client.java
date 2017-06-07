package com.observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Observer ob1=new ConcreteObserver();
		ConcreteSubject manager=new ConcreteSubject();
		manager.attach(ob1);
		manager.change("new state");*/
		Watched watched=new Watched();
		Watcher watcher=new Watcher(watched);
		watched.setData("start");
		watched.setData("run");
		watched.setData("stop");
	}

}
