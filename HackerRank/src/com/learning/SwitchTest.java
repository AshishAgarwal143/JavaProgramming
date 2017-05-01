package com.learning;

public class SwitchTest {

	public static void main(String[] args) {
		final int age=1;
		switch (age) {
		case age:
			System.out.println("age is zero");
			//break;
		case 5:
			System.out.println("age is five");
			//break;
		case 10:
			System.out.println("age is ten");
			//break;
		case 100:
			System.out.println("age is hundred");
			//break;

		default:System.out.println("default");
			//break;
		}
		
	}
}
