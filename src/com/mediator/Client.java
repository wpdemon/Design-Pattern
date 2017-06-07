package com.mediator;

public class Client {
	public static void main(String[] args) {
		MainBoard mediator=new MainBoard();
		CDDriver cdDriver=new CDDriver(mediator);
		CPU cpu=new CPU(mediator);
		VideoCard vc=new VideoCard(mediator);
		AudioCard ac=new AudioCard(mediator);
		mediator.setAudioCard(ac);
		mediator.setCdDriver(cdDriver);
		mediator.setCpu(cpu);
		mediator.setVideoCard(vc);
		cdDriver.readCD();
	}
}
