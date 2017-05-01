package com.operations;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch ="N";
		Scanner read =new Scanner(System.in);
		do {
			System.out.println("Enter the operation you want to do");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			
			int option = read.nextInt();
			System.out.println("Enter the numbers you want to have the operation on");
			int x=read.nextInt();
			int y= read.nextInt();
			int result =-1;
			
			Calculation calculation = CalculationFactory.calculation(option);
			if (calculation == null){
			result = -1;
		}else if(calculation instanceof Addition){
			result =((Addition)calculation).operation(x, y);
		}else if (calculation instanceof Substraction){
			result =((Substraction)calculation).operation(x, y);
		}else if (calculation instanceof Multiplication){
			result = ((Multiplication)calculation).operation(x, y);
		}else if (calculation instanceof Division){
			result = ((Division)calculation).operation(x, y);
		}
			if (result != -1){
				System.out.println("Result "+result);
			}else {
				System.out.println("The result is not correct");
			}
			
			System.out.println("Do you want to do another calculation");
			ch =read.next();
		
		} while (ch.equalsIgnoreCase("Y")|| ch.equalsIgnoreCase("yes"));
read.close();
	}

}
