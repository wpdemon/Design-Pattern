package com.command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer=new AudioPlayer();
		Command playCommand=new PlayCommand(audioPlayer);
		Command rewindCommand=new RewindCommand(audioPlayer);
		Command stopCommand=new StopCommand(audioPlayer);
		MacroAudioCommand macro=new MacroAudioCommand();
		macro.add(playCommand);
		macro.add(rewindCommand);
		macro.add(stopCommand);
		macro.execute();
	}

}
