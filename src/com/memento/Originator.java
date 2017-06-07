package com.memento;

import java.util.ArrayList;
import java.util.List;

public class Originator {
	private String state;
	private List<String> states;
	private int index;
	
	public Originator() {
		// TODO Auto-generated constructor stub
		states=new ArrayList<String>();
		index=0;
	}
	
	public MementoIF createMemento(){
		return new Memo(state);
	}
	 
	
	public Memento createMementoByIndex() {
		return new Memento(states,index);
	}
	
	public void restoreMemento(MementoIF memento) {
		setState(((Memo)memento).getState());
	}
	
	public void restoreMemento(Memento memento) {
		states=memento.getStates();
		index=memento.getIndex();
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
//		this.state = state;
//		System.out.println("��ǰ״̬Ϊ:"+this.state);
		states.add(state);
		index++;
	}
	
	public void printStates() {
		for (String state : states) {
			System.out.println(state);
		}
	}
	
	private class Memo implements MementoIF{
		private String state;
		public Memo(String state) {
			// TODO Auto-generated constructor stub
			this.state=state;
		}
		public String getState() {
			return state;
		}		
	}
	
}
