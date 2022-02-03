package com.simpplilearn.abstraction;

public class Rectangle extends Shape {

	private double length;
	private double width;
	
	public Rectangle(double length,double width,String color)
	{
		super(color);
		this.length=length;
		this.width=width;
	}
	
	double area() {
		return length*width;
	}

	@Override
	public String toString() {
		return "Rectangle color=" + getColor() + " and area is "+area();
	}

	
}
