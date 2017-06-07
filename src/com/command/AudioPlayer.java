package com.command;

public class AudioPlayer {// 接收者
	public void play() {
		System.out.println("播放...");
	}

	public void rewind() {
		System.out.println("倒带...");
	}

	public void stop() {
		System.out.println("停止...");
	}
}
