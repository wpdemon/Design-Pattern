package com.chain;

public class ConcretHandler extends Handler {

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		if (getSuccessor()!=null) {
			System.out.println("转发请求");
			getSuccessor().handleRequest();
		}else {
			System.out.println("处理请求");
		}
	}

}
