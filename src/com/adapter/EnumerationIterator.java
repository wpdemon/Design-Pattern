package com.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object>{//¶ÔÏóÊÊÅäÆ÷

	private Enumeration<?> enumer;
	
	public EnumerationIterator(Enumeration<?> enumer) {
		// TODO Auto-generated constructor stub
		this.enumer=enumer;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enumer.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return enumer.nextElement();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
