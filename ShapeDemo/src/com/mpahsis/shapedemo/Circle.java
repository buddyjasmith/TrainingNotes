package com.mpahsis.shapedemo;

public class Circle extends AbstractShape{
	private int radius;

	public Circle(String colour, int radius) {
		super(colour);
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return (Math.PI * radius * radius);
	}
	@Override
	public double getPerimeter() {
		return (2 * Math.PI * radius);
	}
	@Override
	public String toString() {
		//"Circle [colour=brown, radius=10]"
		return "Circle [colour=" + super.getColour().toUpperCase() + ", radius=" + radius + "]";
	}
	
}
