package com.iterator;

import java.util.Iterator;

public class Client {
	public static void main(String[] args) {
		Product product1=new Product("洗衣机");
		Product product2=new Product("电视机");
		Product product3=new Product("电冰箱");
		ProductList productList=new ProductList();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		Iterator<Product> iterator=productList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}		
	}
}
