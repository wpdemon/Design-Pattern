package com.command;

public class StopCommand implements Command {

	private AudioPlayer myAudio;
	
	public StopCommand(AudioPlayer audioPlayer) {
		// TODO Auto-generated constructor stub
		myAudio=audioPlayer;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myAudio.stop();
	}

}
