package com.edunext.employee;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class EmployeeManagerTest {

	@Test
	public void UTC_01() {
		Manager manager = new Manager(1122, "Scott", 2300.0, "A101", "20-01-2014");

		assertEquals(1122, manager.getId());
		assertEquals("Scott", manager.getName());
		assertEquals((Double) 2300.0, (Double) manager.getSalary());
		assertEquals("A101", manager.getCurrentProject());
		assertEquals(Utilities.stringToDate("20-01-2014"),
				manager.getProjectStartDate());

	}
	
	@Test
	public void UTC_02() {
		Employee employee = new Manager(1122, "Scott", 2300.0, "A999", "20-01-2014");
		assertEquals(1122, employee.getId());
		assertEquals("Scott", employee.getName());
		assertEquals((Double) 2300.0, (Double) employee.getSalary());

	}
	
	@Test
	public void UTC_03() {
		Manager employee = new Manager(1122, "Scott", 2300.0, "A111", "20-01-2014");
		assertTrue(employee instanceof Employee);
	}
	
	@Test
	public void UTC_04() {
		Manager employee = new Manager(1122, "Scott", 2300.0, "P255", "32-01-2014");
		assertNull(employee.getProjectStartDate());
	}

	@Test
	public void UTC_05() {
		Manager employee = new Manager(1122, "Scott", 2300.0, "Q001", "01-01-2000");
		employee.setProjectStartDate("15-05-2018");
		Date d1 = employee.getProjectStartDate();
		System.out.println("WTAF man");
		String actual =  new SimpleDateFormat("dd-MM-yyyy").format(d1);
		assertEquals("15-05-2018",actual);
	}

	@Test(expected=IllegalArgumentException.class)
	public void UTC_06() {
		Employee employee = new Manager(1122, "Scott", 2300.0, "ACME", "01-01-2000");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void UTC_07() {
		Employee employee = new Manager(1122, "Sc", 2300.0, "ACME", "01-01-2000");
	}

}
