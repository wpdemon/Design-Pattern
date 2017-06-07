package com.visitor;

public abstract class Node {
  public void accept(Visitor visitor){
	  visitor.visit(this);
  }
  public abstract void service();
}
