package com.templatemethod;

import java.util.List;

public interface TalkingInterface {//��������
	void start(int interval,final boolean beep);
	void invite(List<String> friends);
}
