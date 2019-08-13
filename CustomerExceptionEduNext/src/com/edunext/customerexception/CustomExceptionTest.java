package com.edunext.customerexception;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


/**
 * Unit tests for the CustomException
 */
public class CustomExceptionTest 
{
    @Test
	public void UTC_01() {
		
		Customer c = new Customer(10,"Amit","2019/01/20");

		
		assertEquals(10, c.getCustId());
		assertEquals("Amit",c.getCustName());
		assertEquals("2019/01/20",c.getRegisterDate());
		
	
	}
	
	@Test
	public void UTC_02() throws LateRegistrationException, ParseException, InvalidRegistrationException {

		Customer c = new Customer(10,"Amit","2019/01/20");
		assertEquals("Registered successfully",c.doRegister());
		
	}

	@Rule
	public ExpectedException expected = ExpectedException.none();

	
	@Test
	public void UTC_03() throws  LateRegistrationException, ParseException, InvalidRegistrationException {

		Customer c = new Customer(10,"Amit","2019/03/20");
		
		expected.expect(LateRegistrationException.class);
		expected.expectMessage("Registration failed");
		c.doRegister();	

	}
	
	@Test
	public void UTC_04() throws ParseException, LateRegistrationException, InvalidRegistrationException{
	
		Customer c = new Customer(10,"Amit","2019-03-20");
		
		expected.expect(ParseException.class);
		expected.expectMessage("Unparseable date: \"2019-03-20\"");
		c.doRegister();
			
		
	}
	
	@Test
	public void UTC_05() throws ParseException, LateRegistrationException, InvalidRegistrationException{
	
		Customer c = new Customer(10,"Amit","2017/14/32");
		
		expected.expect(ParseException.class);
		expected.expectMessage("Unparseable date: \"2017/14/32\"");
		c.doRegister();
			
		
	}
	
	@Test
	public void UTC_06() throws LateRegistrationException, ParseException, InvalidRegistrationException{

		Customer c = new Customer(10,"Amit","2019/02/28");
		assertEquals("Registered successfully",c.doRegister());
		
	}
	
	@Test
	public void UTC_07() throws LateRegistrationException, ParseException, InvalidRegistrationException{

		Customer c = new Customer(10,"Amit","2019/01/01");
		assertEquals("Registered successfully",c.doRegister());
		
	}
	
	@Test
	public void UTC_08() throws LateRegistrationException, ParseException, InvalidRegistrationException{

        Customer c = new Customer(10,"Amit","2018/11/20");
		
		expected.expect(InvalidRegistrationException.class);
		expected.expectMessage("Invalid Date of Registration");
		c.doRegister();
		
	}
  
}