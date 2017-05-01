package com.shape;

public class ShapeFactory {

	public static CalculateAreaPerimeter areaPerimeter(int type) {
		
		CalculateAreaPerimeter calculateAreaPerimeter = null;
		switch (type) {
		case 1:
			calculateAreaPerimeter = new Square();
			break;
		case 2:
			calculateAreaPerimeter = new Rectangle();
			break;
		case 3:
			calculateAreaPerimeter = new Circle();
			break;
		default:
			break;
		}
		return calculateAreaPerimeter;
	}
	
}
