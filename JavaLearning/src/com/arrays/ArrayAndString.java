package com.arrays;

public class ArrayAndString {

	int a[] = { 1, 4, 5, 6, 7, 3, 8, 9, 2, 90, 40, 4 };
	String str = "Testing";
	
	public void test(){
		System.out.println(a.length);
		System.out.println(str.length());
		System.out.println(a.getClass().toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayAndString as= new ArrayAndString();
		as.test();
	}

}
