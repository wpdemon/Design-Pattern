package com.mediator;

public class CDDriver extends Colleague {

	private String data="";
	
	public CDDriver(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public String getData(){
		return data;
	}

	public void readCD() {
		this.data="视频数据,音频数据";
		getMediator().changed(this);
	}
}
