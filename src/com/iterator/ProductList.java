package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ProductList implements Iterable<Product>{
	private List<Product> list=new ArrayList<Product>();
	private int count;
	public void add(Product product) {
		list.add(product);
		count++;
	}
	
	public void remove(Product product) {
		list.remove(product);
		count--;
	}
	
	public int count() {
		return count;
	}
	
	public List<Product> getList() {
		return list;
	}

	@Override
	public Iterator<Product> iterator() {
		// TODO Auto-generated method stub
		return new ProductIterator(this);
	}	
	
	private class ProductIterator implements Iterator<Product>{

		private int count=0;
		private ProductList list;
		
		public ProductIterator(ProductList list) {
			// TODO Auto-generated constructor stub
			this.list=list;
			count=list.count();
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (count==0) {
				return false;
			}else {
				return true;
			}		
		}

		@Override
		public Product next() {
			// TODO Auto-generated method stub
			Product product=list.getList().get(--count);
			return product;
		}

	}
}
