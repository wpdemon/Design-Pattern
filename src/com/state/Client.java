package com.state;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State state=new StateB();
		Context context=new Context();
		context.setState(state);
		context.request("test");
	}

}
