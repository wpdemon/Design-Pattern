package com.mediator;

public class AudioCard extends Colleague {

	public AudioCard(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void soundData(String data) {
		System.out.println("ÉùÒô:"+data);
	}
}
