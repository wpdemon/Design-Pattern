package com.command;

public class Invoker {
	private Command command=null;
	
	public Invoker(Command command) {
		// TODO Auto-generated constructor stub
		this.command=command;
	}
	
	public void action() {
		command.execute();
	}
}
