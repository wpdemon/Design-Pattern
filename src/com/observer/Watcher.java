package com.observer;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {

	public Watcher(Observable o) {
		// TODO Auto-generated constructor stub
		o.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof Watched){
			System.out.println("״̬�仯Ϊ"+((Watched)o).getData());
		}
	}

	

}
