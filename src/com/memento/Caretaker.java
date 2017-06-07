package com.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	private MementoIF memento;
	private List<Memento> mementos=new ArrayList<Memento>();
	private int current;
	private Originator originator;
	
	public Caretaker(Originator originator) {
		// TODO Auto-generated constructor stub
		this.originator=originator;
		current=0;
	}
	
	public MementoIF retrieveMemento() {
		return this.memento;
	}
	
	public void saveMemento(MementoIF memento) {
		this.memento=memento;
	}
	
	/**
	 * 创建一个新的检查点
	 * @return
	 */
	public int createMemento() {
		Memento memento=originator.createMementoByIndex();		
		mementos.add(memento);
		return current++;
	}
	
	public void restoreMemento(int index) {		
		Memento memento=mementos.get(index);
		originator.restoreMemento(memento);		
	}
	
	public void removeMemento(int index) {
		mementos.remove(index);
		current--;
	}
}
