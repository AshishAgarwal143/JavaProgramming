package com.learning;

import java.util.Scanner;

public class Multiples {
	
	public void usingWhile(int num){		
		int i =1;
		System.out.println("inside while");
		while(i<=10){
			int result = i*num;
			System.out.println(num+" x "+i+" = "+result);
			i++;			
		}
	}
	
	public void usingFor(int num) {
		System.out.println("inside for");
		for(int i=1;i<=10;i++){
			int result = i*num;
			System.out.println(num+" x "+i+" = "+result);
		}		
	}
	
	public void usingDoWhile(int num) {
		int i=1;
		System.out.println("inside do while");
		do {
			int result=i*num;			
			System.out.println(num+" x "+i+" = "+result);
			i++;
		} while (i<=10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		Multiples m=new Multiples();
		int a= in.nextInt();
		m.usingWhile(a);
		m.usingFor(a);
		m.usingDoWhile(a);
		in.close();

	}

}
