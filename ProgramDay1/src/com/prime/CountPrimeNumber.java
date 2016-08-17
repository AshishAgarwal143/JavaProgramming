package com.prime;

import java.util.Scanner;

public class CountPrimeNumber {

	private static Scanner cin;

	final static boolean IsPrime(int x) {
		Boolean flag = false;
		int y = x / 2;
		for (int i = 2; i < y; i++) {
			if (x % i == 0) {
				System.out.println("Not a prime number " + x);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Number is prime " + x);
		}
		return flag;
	}

	public static void main(String[] args) {

		cin = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the start value ");
		int a = cin.nextInt();
		System.out.println("Enter the last value ");
		int b = cin.nextInt();
		for (int i = a; i <= b; i++) {
			boolean value = IsPrime(i);
			if (value == false) {
				count++;
			}

		}
		System.out.println("Number of prime number in between" + a + " and "
				+ b + " is :" + count);

	}

}
