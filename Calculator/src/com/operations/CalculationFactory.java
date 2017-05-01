package com.operations;

public class CalculationFactory {
	
	public static Calculation calculation(int type) {
		Calculation calculation =null;
		switch (type) {
		case 1:
			calculation =new Addition();
			break;	
		case 2:
			calculation=new Substraction();
			break;
		case 3:
			calculation =new Multiplication();
			break;	
		case 4:
			calculation=new Division();
			break;

		default:
			break;
		}
		return calculation;
	}

}
