package com.chain;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler handler1=new ConcretHandler();
		Handler handler2=new ConcretHandler();
		handler1.setSuccessor(handler2);
		handler1.handleRequest();
	}

}
