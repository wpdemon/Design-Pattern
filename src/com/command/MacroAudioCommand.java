package com.command;

import java.util.ArrayList;
import java.util.List;

public class MacroAudioCommand implements MacroCommand {

	private List<Command> commandList=new ArrayList<Command>();
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for (Command command : commandList) {
			command.execute();
		}
	}

	@Override
	public void add(Command cmd) {
		// TODO Auto-generated method stub
		commandList.add(cmd);
	}

	@Override
	public void remove(Command cmd) {
		// TODO Auto-generated method stub
		commandList.remove(cmd);
	}

}
