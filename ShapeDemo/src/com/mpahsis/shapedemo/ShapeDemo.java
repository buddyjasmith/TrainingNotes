package com.mpahsis.shapedemo;

import java.util.Scanner;

public class ShapeDemo {
	public static void main(String[] args) {
		String colour;
		Scanner kb = new Scanner(System.in);
		String classType = kb.nextLine();
		
		if(classType.equalsIgnoreCase("circle")) {
			colour = kb.next();
			int radius = kb.nextInt();
			Circle circle = new Circle(colour,radius);
			ShapeDemo.printShape(circle);
		}
		else
		if(classType.equalsIgnoreCase("rectangle")) {
			 colour = kb.next();
			 int length = kb.nextInt();
			 int breadth = kb.nextInt();
			 Rectangle rectangle = new Rectangle(colour, length, breadth);
			 ShapeDemo.printShape(rectangle);
		}
		kb.close();
	}
	public static void printShape(Shape shape) {
		if(shape instanceof Circle) {
			Circle circle = (Circle) shape;
			System.out.println(circle.toString());
			System.out.printf("Area: %d,Perimeter: %d", (int)Math.round(circle.getArea()),(int)Math.round(circle.getPerimeter()));
		}else
		 if(shape instanceof Rectangle) {
			 Rectangle r = (Rectangle) shape;
			 System.out.println(r.toString());
			 System.out.printf("Area: %d,Perimeter: %d", (int)Math.round(r.getArea()),(int)Math.round(r.getPerimeter()));
		 }
		
	}
}
