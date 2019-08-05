package com.mphasis.staticmethods;

import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StaticMethodsTest {

	@Test
	public void UTC_01() {
		assertEquals(0, Utility.fahrenheitToCelcius(32));
	}
	
	@Test
	public void UTC_02() {
		assertEquals(40, Utility.fahrenheitToCelcius(104));
	}
	
	@Test
	public void UTC_03() {
		assertEquals(4, Utility.fahrenheitToCelcius(40));
	}
	
	@Test
	public void UTC_04() {
		assertEquals(-4, Utility.fahrenheitToCelcius(25));
	}

	@Test
	public void UTC_05() {
		assertEquals(-9, Utility.fahrenheitToCelcius(15));
	}
	
	@Test
	public void UTC_06() {
		assertEquals(-18, Utility.fahrenheitToCelcius(0));
	}
	
	@Test
	public void UTC_07() {
		assertEquals("HIGH", Utility.getLevel(new int[] {20,30,50,1}));
	}
	
	@Test
	public void UTC_08() {
		assertEquals("HIGH", Utility.getLevel(new int[] {20,30,50}));
	}
	
	@Test
	public void UTC_09() {
		assertEquals("MEDIUM", Utility.getLevel(new int[] {5,20,-5,50,1}));
	}
	
	@Test
	public void UTC_10() {
		assertEquals("MEDIUM", Utility.getLevel(new int[] {5,20,-5,50}));
	}

	@Test
	public void UTC_11() {
		assertEquals("LOW", Utility.getLevel(new int[] {4,10,5,50}));
	}
	
	@Test
	public void UTC_12() {
		assertEquals("LOW", Utility.getLevel(new int[] {-5,-5}));
	}
}