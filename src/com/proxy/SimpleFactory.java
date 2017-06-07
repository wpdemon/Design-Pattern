package com.proxy;

public class SimpleFactory {
	public Translate getTranslate(String name) {
		Translate translate=null;
		try {
			translate=(Translate)Class.forName(name).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return translate;
	}
}
