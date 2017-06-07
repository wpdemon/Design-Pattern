package com.builder;

public interface Builder {//建造者模式
	public void buildPart1();
	public void buildPart2();
	public Product retrieveResult();
}
