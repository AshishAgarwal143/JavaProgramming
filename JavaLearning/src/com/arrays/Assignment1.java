package com.arrays;

import java.util.Scanner;

public class Assignment1 {

	int a[] = { 1, 4, 6, 3, 7, 8, 4, 9, 10, 5 };
	
	public static int[] insertionSort(int[]a) {
		int tmp;
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
				}
			}
		}
		return a;
	}

	public boolean LinearSearch(int x) {
		int input = x;
		for (int val = 0; val < a.length; val++) {
			if (a[val] == input) {
				System.out.println("Value is present in the array");
				return true;
			}
		}
		System.out.println("Value in not present in the array");
		return false;
	}

	private static Scanner cin;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment1 a = new Assignment1();
		int b[] = { 1, 4, 6, 3, 7, 8, 4, 9, 10, 5 };
		/*
		 * cin = new Scanner(System.in);
		 * System.out.println("Enter the number to do the search "); int x =
		 * cin.nextInt(); System.out.println(a.LinearSearch(x));
		 */
int x[]=insertionSort(b);
for (int i:x){
	System.out.print(i+" ");
}

	}
}
