package com.shape;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch ="N";
		Scanner read =new Scanner(System.in);
		do {
			System.out.println("Enter the Shape you want the area and perimeter of:");
			System.out.println("1.Square");
			System.out.println("2.Rectangle");
			System.out.println("3.Circle");
			int x=0;
			int option = read.nextInt();
			if (option == 1){
				System.out.println("Enter the side of the square");
				x=read.nextInt();
			}else if (option == 2){
				System.out.println("Enter the length of the Rectangle");
				x=read.nextInt();
				/*System.out.println("Enter the breadth of the Rectangle");
				y = read.nextInt();*/
			}else if (option == 3) {
				System.out.println("Enter the radius of the circle");
				x=read.nextInt();
			}
			
			int area = 0;
			int perimeter= 0;
			int y =0;
			
			CalculateAreaPerimeter calculation = ShapeFactory.areaPerimeter(option);
			if (calculation == null){
			area = 0;
			perimeter = 0;
		}else if(calculation instanceof Square){
			area =((Square)calculation).Area(x, y);
			perimeter = ((Square)calculation).Perimeter(x, y);
		}else if (calculation instanceof Rectangle){
			area =((Rectangle)calculation).Area(x, y);
			perimeter = ((Rectangle)calculation).Perimeter(x, y);
		}else if (calculation instanceof Circle){
			area =((Circle)calculation).Area(x, y);
			perimeter = ((Circle)calculation).Perimeter(x, y);
		}
			if (area != 0 && perimeter !=0){
				System.out.println("Area of the Shape "+area);
				System.out.println("Perimeter of the shape "+perimeter);
			}else {
				System.out.println("The result is not correct");
			}
			
			System.out.println("Do you want to do get area and perimeter for another shape(Y/N)");
			ch =read.next();
		
		} while (ch.equalsIgnoreCase("Y")|| ch.equalsIgnoreCase("yes"));
read.close();
	}
	

}
