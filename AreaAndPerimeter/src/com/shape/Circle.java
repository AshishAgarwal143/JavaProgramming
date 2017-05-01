package com.shape;

public class Circle implements CalculateAreaPerimeter {

	public final double pi = 3.14;
	@Override
	public int Area(int x, int y) {
		// TODO Auto-generated method stub
		int area = (int)(pi*x*x);
		return area;
	}

	@Override
	public int Perimeter(int x, int y) {
		// TODO Auto-generated method stub
		int perimeter = (int)(pi*2*x);
		return perimeter;
	}

}
