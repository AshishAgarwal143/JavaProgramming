package com.arrays;

public class Array1 {
	{
		System.out.println("Instance block");
	}
	static{
		System.out.println("In static block");
	}
	
	
	private int counter;
	public Array1() {
		// TODO Auto-generated constructor stub
		counter ++;
	}
	public int getinstanceof() {
		return counter;
	}

}
