package com.adapter;

public enum EnumTest {
	SUN(0){

		@Override
		public boolean isRest(){
			// TODO Auto-generated method stub
			return true;
		}
		
	},
	MON(1),
	TUE(2),
	WED(3),
	THU(4),
	FRI(5),
	SAT(6);
	private int value;
	private EnumTest(int value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}
	public int getValue() {
		return value;
	}
	
	public boolean isRest() {
		return false;
	}
}
