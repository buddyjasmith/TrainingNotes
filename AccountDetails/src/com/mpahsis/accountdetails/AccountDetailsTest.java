package com.mpahsis.accountdetails;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccountDetailsTest {

	@Test
	public void UTC_01() {
	    Account.setCounter(0);
		Account a1 = new Account(400.5, "Savings");
		assertEquals(1, a1.accountNo);
		assertEquals(400.5, a1.balance,0.01);
		assertEquals("Savings", a1.accountType);
	}

	@Test
	public void UTC_02() {
		Account a1 = new Account(100.5, "Savings");
		a1.depositAmount(50.25);
		assertEquals(150.75, a1.balance,0.01);
	}

	@Test
	public void UTC_03() {
		Account a1 = new Account(100.5, null);
		Account a2 = new Account(200.5, null);
		assertEquals(3, a1.accountNo);
		assertEquals(4, a2.accountNo);
	}
}