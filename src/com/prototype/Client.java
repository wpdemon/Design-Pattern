package com.prototype;

import java.io.IOException;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Clone product=new ProductClone();
		product.setNum(10);
		product.setPrice(15);
		product.setRebeta(20);		
		System.out.println("ԭ���Ķ���:num="+product.getNum());
		Clone product1=(Clone)product.deepClone();
		product1.setNum(15);
		System.out.println("�ɶ���:"+product.getNum()+",�¶���:"+product1.getNum());
	}

}
