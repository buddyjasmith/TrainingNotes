package com.mpahsis.shapedemo;

public class Rectangle extends AbstractShape{
	private int length;
	private int breadth;
	public Rectangle(String colour, int length, int breadth) {
		super(colour);
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public String toString() {
		return "Rectangle [colour=" + super.getColour().toUpperCase() + ", length=" + length + ", breadth=" + breadth + "]";
	}
	@Override
	public double getArea() {
		return breadth * length;
	}

	@Override
	public double getPerimeter() {
		return ((2*breadth)+(2 * length));
	}
	
}
