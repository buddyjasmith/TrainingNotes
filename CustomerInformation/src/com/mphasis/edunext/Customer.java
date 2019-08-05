package com.mphasis.edunext;

public class Customer {
	private int custId;
	private String name;
	private Address address;
	private SimpleDate registrationDate;
	public Customer(int custId, String name, Address address, SimpleDate registrationDate) {
		super();
		this.custId = custId;
		this.name = name;
		this.address = address;
		this.registrationDate =  (SimpleDate.validateDate(registrationDate)) ?
							      registrationDate : null;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public SimpleDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(SimpleDate registrationDate) {
		
		this.registrationDate =  (SimpleDate.validateDate(registrationDate))?
			      				  registrationDate : null;
	}
	@Override
	public String toString() {
		String datecheck;
		try {
		 datecheck = (registrationDate.toString() == null)? "Unknown":registrationDate.toString();
		}catch(NullPointerException e) {
			datecheck = "Unknown";
		}
		String locale;
		try {
			locale = address.toString();
		}catch(NullPointerException n) {
			locale = "Unknown";
		}
		return ("Id : " + custId +", " + "Name : " + name +"\n"+
				"Address : " + locale + "\n" +
				"Registered on : " + datecheck);
	}
	
	
}
