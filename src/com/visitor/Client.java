package com.visitor;

public class Client {

	static class Horse{
		
	}
	
	static class WhiteHorse extends Horse{
		
	}
	
	static class BlackHorse extends Horse{
		
	}
	
	public void ride(Horse h){
		System.out.println("����");
	}
	
	public void ride(WhiteHorse h){
		System.out.println("�����");
	}
	
	public void ride(BlackHorse h){
		System.out.println("�����");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitor visitor=new VisitorImpl();
		Node nodeA=new NodeA();
		Node nodeB=new NodeB();
		nodeA.accept(visitor);
		nodeB.accept(visitor);
	}

}
