package com.memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {//°×Ïä±¸ÍüÄ£Ê½	
	private List<String> states;
	private int index;
	
	public Memento(List<String> states,int index) {
		this.states=new ArrayList<String>(states);
		this.index=index;
	}

	public List<String> getStates() {
		return states;
	}

	public int getIndex() {
		return index;
	}	
	
}
