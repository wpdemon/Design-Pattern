package com.templatemethod;

import java.util.List;

public interface TalkingInterface {//保护代理
	void start(int interval,final boolean beep);
	void invite(List<String> friends);
}
