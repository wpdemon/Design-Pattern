package com.builder;

public class ConcreteBuilder implements Builder {

	private Product product=new Product();
	
	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		product.setPart1("±àºÅ£º9527");
	}

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		product.setPart2("Ãû³Æ£ºXXX");
	}

	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
