package com.builder;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Builder builder=new ConcreteBuilder();
		Director director=new Director(builder);
		director.construct();
		Product product=builder.retrieveResult();
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
		System.out.println(product.getClass().newInstance().getPart1());
		Product product2=(Product)Class.forName("com.builder.Product").newInstance();
		product2.setPart1("XXX");
		System.out.println(product2.getPart1());
	}

}
