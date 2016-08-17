package com.fibonacii;

import java.util.Scanner;

public class FibonaciNumber {

	private static Scanner cin;

	public static void main(String[] args) {
		cin = new Scanner(System.in);
		System.out.println("Enter the number of fibonacii you wanted ");
		int count = cin.nextInt();
		int first = 0;
		int second = 1;
		int third;

		for (int i = 0; i < (count - 2); i++) {
			third = first + second;
			System.out.println(third);
			first = second;
			second = third;
		}

	}

}
