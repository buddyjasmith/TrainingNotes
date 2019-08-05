package com.mphasis.edunext;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerInformationTest {
	
	@Test
	public void UTC_01(){
		SimpleDate d1 = new SimpleDate(10, 10, 2015);
		assertEquals(10, d1.getDay());
		assertEquals(10, d1.getMonth());
		assertEquals(2015, d1.getYear());
	}
	
	@Test
	public void UTC_02(){
		SimpleDate d1 = new SimpleDate(1, 11, 2018);
		d1.setDate(5, 5, 2005);
		assertEquals(5, d1.getDay());
		assertEquals(5, d1.getMonth());
		assertEquals(2005, d1.getYear());
	}

	@Test
	public void UTC_03(){
		SimpleDate d1 = new SimpleDate(1, 11, 2018);
		assertTrue("1/11/2018".equals(d1.toString()));
	}
	
	@Test
	public void UTC_04(){
		SimpleDate d1 = new SimpleDate(30, 11, 2018);
		assertTrue(SimpleDate.validateDate(d1));
	}
	
	@Test
	public void UTC_05(){
		SimpleDate d1 = new SimpleDate(29, 2, 2018);
		assertFalse(SimpleDate.validateDate(d1));
	}
	
	@Test
	public void UTC_06(){
		SimpleDate d1 = new SimpleDate(-1, 1, 2018);
		assertFalse(SimpleDate.validateDate(d1));

	}
	
	@Test
	public void UTC_07(){
		SimpleDate d1 = new SimpleDate(15, 13, 2018);
		assertFalse(SimpleDate.validateDate(d1));

	}
	
	@Test
	public void UTC_08(){
		SimpleDate d1 = new SimpleDate(31, 3, 2018);
		assertTrue(SimpleDate.validateDate(d1));
	}
	
	
	@Test
	public void UTC_09(){
		SimpleDate d1 = new SimpleDate(31, 3, 1990);
		assertFalse(SimpleDate.validateDate(d1));
	}
	
	@Test
	public void UTC_10(){
		Address a1 = new Address("Karol Bagh", "New Delhi");
		assertEquals("Karol Bagh", a1.getArea());
		assertEquals("New Delhi", a1.getCity());
	}
	
	@Test
	public void UTC_11(){
		Address a1 = new Address(null, null);
		a1.setArea("Jayanagar");
		a1.setCity("Bangalore");
		assertEquals("Jayanagar", a1.getArea());
		assertEquals("Bangalore", a1.getCity());
	}
	
	@Test
	public void UTC_12(){
		Address a1 = new Address("KarolBagh", "NewDelhi");
		assertTrue("KarolBagh, NewDelhi".equalsIgnoreCase(a1.toString()));
	}	
	
	@Test
	public void UTC_13(){
		Customer c1 = new Customer(201, "Manzoor", new Address("KarolBagh", "NewDelhi"), new SimpleDate(10, 10, 2015));
		assertNotNull(c1.getAddress());
		assertNotNull(c1.getRegistrationDate());
		assertEquals("KarolBagh", c1.getAddress().getArea());
		assertEquals("NewDelhi", c1.getAddress().getCity());
		assertEquals(10, c1.getRegistrationDate().getDay());
		assertEquals(10, c1.getRegistrationDate().getMonth());
		assertEquals(2015, c1.getRegistrationDate().getYear());
	}
	
	@Test
	public void UTC_14(){
		Customer c1 = new Customer(201, "Manzoor", new Address("KarolBagh", "NewDelhi"), new SimpleDate(10, 10, 2015));
		String details = c1.toString();
		assertTrue(details.contains("Id : 201, Name : Manzoor"));
		assertTrue(details.contains("Address : KarolBagh, NewDelhi"));
		assertTrue(details.contains("Registered on : 10/10/2015"));
		assertTrue(details.indexOf("Id :") < details.indexOf("Address :"));
		assertTrue(details.indexOf("Address :") < details.indexOf("Registered on"));
	}
	
	@Test
	public void UTC_15(){
		Customer c1 = new Customer(201, "Manzoor", null, null);
		assertNull(c1.getAddress());
		assertNull(c1.getRegistrationDate());
		String details = c1.toString();
		assertTrue(details.contains("Address : Unknown"));
		assertTrue(details.contains("Registered on : Unknown"));
		assertTrue(details.indexOf("Id :") < details.indexOf("Address :"));
		assertTrue(details.indexOf("Address :") < details.indexOf("Registered on"));
	}
	
	@Test
	public void UTC_16(){
		Customer c1 = new Customer(201, "Manzoor", new Address("KarolBagh", "NewDelhi"), new SimpleDate(10, 10, 1990));
		assertNotNull(c1.getAddress());
		assertNull(c1.getRegistrationDate());
		String details = c1.toString();
		assertTrue(details.contains("Registered on : Unknown"));
	}
}