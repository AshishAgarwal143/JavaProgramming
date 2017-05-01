package com.arrays;

import java.util.Arrays;

public class Program3 {
	static char []sortingString(String s) {
		char c[]=s.toCharArray();
		char tmp;
		for (int i = 0; i < c.length - 1; i++) {
			for (int j = 1; j < c.length - i; j++) {
				if (c[j - 1]>(c[j])) {
					tmp = c[j - 1];
					c[j - 1] = c[j];
					c[j] = tmp;
				}
			}
		}
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a= "This is a test";
		
		char c1[]= sortingString(a.toLowerCase());
		for (int i = 0; i < c1.length; i++) {
			System.out.print(c1[i]);
		}		}

}
