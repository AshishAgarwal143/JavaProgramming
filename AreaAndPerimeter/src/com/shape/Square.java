package com.shape;

public class Square implements CalculateAreaPerimeter {

	@Override
	public int Area(int x, int y) {
		// TODO Auto-generated method stub
		return x*x;
	}

	@Override
	public int Perimeter(int x, int y) {
		// TODO Auto-generated method stub
		return 4*x;
	}

}
