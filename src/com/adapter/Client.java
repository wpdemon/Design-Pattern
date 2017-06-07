package com.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;	

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		ListIterator<Integer> iter=list.listIterator();
		while(iter.hasPrevious()){
			int value=iter.previous();
			
		}
		Random random=new Random();
		list.add(random.nextInt(10));
		list.add(random.nextInt(10));
		IteratorEnumeration enumer=new IteratorEnumeration(list.iterator());
		while (enumer.hasMoreElements()) {
			Integer value = (Integer) enumer.nextElement();
			System.out.print(value+" ");
		}
		System.out.println(EnumTest.FRI.ordinal());		
		
		List<String> list2=new ArrayList<String>(Arrays.asList("b","a","b","b","c","d"));
		for (int i = 0; i<list2.size(); i++) {
			if ("b".equals(list2.get(i))) {
				list2.remove(i);
			}
		}
		System.out.println(list2);
		
	}

}
