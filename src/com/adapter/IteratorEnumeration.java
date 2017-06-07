package com.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration<Object> {

	private Iterator<?> iter;
	
	public IteratorEnumeration(Iterator<?> iter) {
		// TODO Auto-generated constructor stub
		this.iter=iter;
	}
	
	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return iter.hasNext();
	}

	@Override
	public Object nextElement() {
		// TODO Auto-generated method stub
		return iter.next();
	}

}
