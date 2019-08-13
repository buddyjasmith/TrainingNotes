package com.edunext.customerexception;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.DateFormat;


public class Customer {
	private final static String startDate="2019/01/01";
	private final static String lastDate="2019/02/28";
	public static  Map<Integer, Integer> map = new HashMap<Integer,Integer>();
	private int custId;
	private String custName;
	private String registerDate;
	public Customer(int custId, String custName, String registerDate) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.registerDate = registerDate;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public static String getStartdate() {
		return startDate;
	}
	public static String getLastdate() {
		return lastDate;
	}
	public String doRegister() throws InvalidRegistrationException,LateRegistrationException  {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		format.setLenient(false);
		Date reg;
		Date last;
		Date start;
		String returnValue = "";
		try {
			reg = format.parse(registerDate);
			last = format.parse(lastDate);
			start = format.parse(startDate);
			if(reg.after(last)) 
				throw new LateRegistrationException("Registration Failed");
			if(reg.before(start)) {
				throw new InvalidRegistrationException( "Invalid Date of Registration");
			}
			else {
				
				returnValue += "Registered successfully";
				return returnValue;
			}
		}catch(ParseException e) {
			e.getMessage();
			//System.out.println("Unparseable date: " + "\"" + registerDate + "\"");
			returnValue += "Unparseable date: " + "\"" + registerDate + "\"";
			return returnValue;
		}catch(InvalidRegistrationException i) {
			i.getMessage();
			returnValue += "Invalid Date of Registration";
			//System.out.println("Invalid Date of Registration");
			
			return returnValue;
		}catch(LateRegistrationException l) {
			l.getMessage();
			//System.out.println("Registration Failed");
			returnValue += "Registration Failed";
			return returnValue;
		}
		
		
	
	
		
		
		
		
	}
	
	

 
}
