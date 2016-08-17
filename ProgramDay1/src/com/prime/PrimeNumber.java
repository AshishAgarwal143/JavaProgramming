package com.prime;

public class PrimeNumber {

	public static void main(String[] args) {

		Boolean flag = false;
		int x = 21;
		int y = x / 2;
		for (int i = 2; i < y; i++) {
			if (x % i == 0) {
				System.out.println("Not a prime number");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Number is prime ");
		}
	}
}
