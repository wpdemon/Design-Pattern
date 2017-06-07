package com.command;

public class PlayCommand implements Command {

	private AudioPlayer myAudio;
	
	public PlayCommand(AudioPlayer audioPlayer) {
		// TODO Auto-generated constructor stub
		myAudio=audioPlayer;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myAudio.play();
	}

}
