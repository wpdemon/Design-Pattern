package com.iterator;

import java.util.Iterator;

public class Client {
	public static void main(String[] args) {
		Product product1=new Product("ϴ�»�");
		Product product2=new Product("���ӻ�");
		Product product3=new Product("�����");
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
