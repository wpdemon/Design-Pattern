package com.flyweight;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactor factory = new FlyweightFactor();
		Flyweight fly = factory.factory(new Character('a'));
		fly.operation("First Call");

		fly = factory.factory(new Character('b'));
		fly.operation("Second Call");

		fly = factory.factory(new Character('a'));
		fly.operation("Third Call");
	}

}
