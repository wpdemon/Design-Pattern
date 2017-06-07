package com.mediator;

public abstract class Colleague {
	private Mediator mediator;
	
	public Colleague(Mediator mediator) {
		// TODO Auto-generated constructor stub
		this.mediator=mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}
	
}
