package com.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactor {//ÏíÔªÄ£Ê½
	private Map<Character, Flyweight> filesMap = new HashMap<Character, Flyweight>();

	public Flyweight factory(Character state) {
		Flyweight fly = filesMap.get(state);
		if (fly == null) {
			fly = new ConcreteFlyweight(state);
			filesMap.put(state, fly);
		}
		return fly;
	}

	public Flyweight factory(List<Character> compositeState) {
		ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();

		for (Character state : compositeState) {
			compositeFly.add(state, this.factory(state));
		}
		return compositeFly;
	}
}
