package com.visitor;

public class VisitorImpl implements Visitor {

	@Override
	public void visit(Node node) {
		// TODO Auto-generated method stub
		node.service();
	}

}
