package com.chain;

public class ConcretHandler extends Handler {

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		if (getSuccessor()!=null) {
			System.out.println("ת������");
			getSuccessor().handleRequest();
		}else {
			System.out.println("��������");
		}
	}

}
