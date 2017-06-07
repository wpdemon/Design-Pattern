package com.command;

public class ConcreteCommand implements Command{

	private Receiver recv=null;
	
	public ConcreteCommand(Receiver recv) {
		// TODO Auto-generated constructor stub
		this.recv=recv;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		recv.action();
	}

}
