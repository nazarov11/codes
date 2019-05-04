package com.class28;

public interface Shape {
	void calculateArea(double r);
	void calculatePerimeter(double r);
	

}
class circle implements Shape{
	double p = 3.14;
	double r;
	@Override
	public void calculateArea(double r) {
		double area;
		p = 3.14;
		this.r = r;
		
		area = p * r * r;
		System.out.println("The are of circle is " + area);
	}

	@Override
	public void calculatePerimeter(double r) {
		double perimeter;
		p = 3.14;
		this.r = r;
		perimeter = 2 * p * r;
		System.out.println("The are of circle is " + perimeter);

	}
	
}
class rectangle implements Shape {
	double side1;
	
	@Override
	public void calculateArea(double r) {
		double area;
		double side1 = r;
		
		area = r * r;
		System.out.println(area);
	}

	@Override
	public void calculatePerimeter(double r) {
		double perimeter;
		
		side1 = r;
		perimeter = (r + r) * 2;
		System.out.println(perimeter);
	}
	
}
