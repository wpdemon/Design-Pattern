package com.proxy;

public interface PersonBean {
	String getName();
	String getGender();
	String getInterests();
	int getHorOrNotRating();
	
	void setName(String name);
	void setGender(String gender);
	void setInterests(String interests);
	void setHotOrNotRating(int rating);
}
