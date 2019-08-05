package com.mpahsis.shapedemo;

public abstract class AbstractShape implements Shape{
	private String colour;
	
	
	public AbstractShape(String colour) {
		super();
		this.colour = colour;
	}

	@Override
	public abstract double getArea();

	@Override
	public abstract double getPerimeter();

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return ("Colour=" + colour);
	}
	
}
