package com.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	//	Component componentB=new DecoratorB(new DecoratorA(new ConcreteComponent()));
	//	componentB.Operation();
	/*	GreatestSage sage=new Monkey();
		GreatestSage bird=new Bird(sage);
		GreatestSage fish=new Fish(bird);
		fish.move();*/
		Beverage beverage=new HouseBlend();
		beverage=new Soy(beverage);
		beverage=new Mocha(beverage);
		beverage=new Whip(beverage);	
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		/*try {
			int c;
			InputStream in=new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("e:/1.txt")));
			while ((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
