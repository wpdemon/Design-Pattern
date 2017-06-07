package com.observer;

import java.util.Observable;

public class Watched extends Observable {
	private String data="";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		if (!data.equals(this.data)) {
			this.data = data;
			setChanged();
		}
		notifyObservers();//采用拉方式
	}
	
}
