package com.prototype;

import java.io.Serializable;

public class ProductClone extends Clone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Object clone(){
		// TODO Auto-generated method stub
		Clone obj=new ProductClone();
		obj.setNum(super.getNum());
		obj.setPrice(super.getPrice());
		obj.setRebeta(super.getRebeta());
		return obj;
	}


}
