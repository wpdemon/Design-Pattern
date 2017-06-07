package com.observer;

public interface Observer {
	public void update(String state);//推模型
	public void update(Subject subject);//拉模型
}
