package com.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ConcreteCompositeFlyweight implements Flyweight {

	private Map<Character, Flyweight> files=new HashMap<Character, Flyweight>();
	
	public void add(Character state,Flyweight fly) {
		files.put(state, fly);
	}
	
	@Override
	public void operation(String state) {
		// TODO Auto-generated method stub
		Flyweight fly=null;
		for (Character ch : files.keySet()) {
			fly=files.get(ch);
			fly.operation(state);
		}
	}

}
