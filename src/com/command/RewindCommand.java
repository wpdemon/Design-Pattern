package com.command;

public class RewindCommand implements Command {

	private AudioPlayer myAudio;
	
	public RewindCommand(AudioPlayer audioPlayer) {
		// TODO Auto-generated constructor stub
		myAudio=audioPlayer;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myAudio.rewind();
	}

}
