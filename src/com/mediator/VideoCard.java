package com.mediator;

public class VideoCard extends Colleague {

	public VideoCard(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void showData(String data) {
		System.out.println("您正在观看的是"+data);
	}

}
