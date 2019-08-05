package com.mpahsis.shapedemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShapeDemoTest {
	private static Circle c1;
	private static Shape s1;
	private static Rectangle r1;
	private static Shape s2;
	
	@BeforeClass
	public static void setup() {
		c1 = new Circle("brown", 10);
		s1 = new Circle("green", 5);
		r1 = new Rectangle("brown", 10, 20);
		s2 = new Rectangle("green", 15, 5);
	}
	
	@Test
	public void UTC_01() {
		assertTrue(c1 instanceof Circle);
		assertTrue(c1 instanceof AbstractShape);
		assertTrue(c1 instanceof Shape);
	}
	
	@Test
	public void UTC_02() {
		assertTrue(s1 instanceof Circle);
		assertTrue(s1 instanceof AbstractShape);
		assertTrue(s1 instanceof Shape);
	}
	
	@Test
	public void UTC_03() {
		assertTrue(r1 instanceof Rectangle);
		assertTrue(r1 instanceof AbstractShape);
		assertTrue(r1 instanceof Shape);
	}
	
	@Test
	public void UTC_04() {
			assertTrue(s2 instanceof Rectangle);
			assertTrue(s2 instanceof AbstractShape);
			assertTrue(s2 instanceof Shape);
	}

	@Test
	public void UTC_05() {
		assertTrue(c1.toString().equalsIgnoreCase("Circle [colour=brown, radius=10]"));
		assertTrue(s1.toString().equalsIgnoreCase("Circle [colour=green, radius=5]"));
	}
	
	@Test
	public void UTC_06() {
		assertTrue(r1.toString().equalsIgnoreCase("Rectangle [colour=brown, length=10, breadth=20]"));
		assertTrue(s2.toString().equalsIgnoreCase("Rectangle [colour=green, length=15, breadth=5]"));
	}
	
	@Test
	public void UTC_07() {
		assertEquals(314.16, c1.getArea(),0.01);
		assertEquals(62.83, c1.getPerimeter(),0.01);
	}
	
	@Test
	public void UTC_08() {
		assertEquals(78.54, s1.getArea(),0.01);
		assertEquals(31.42, s1.getPerimeter(),0.01);
	}
	
	@Test
	public void UTC_09() {
		assertEquals(200, r1.getArea(),0.01);
		assertEquals(60, r1.getPerimeter(),0.01);
	}

	@Test
	public void UTC_10() {
		assertEquals(75, s2.getArea(),0.01);
		assertEquals(40, s2.getPerimeter(),0.01);
	}
}