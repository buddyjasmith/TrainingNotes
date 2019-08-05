package com.mphasis.edunext;

public class Address {
	private String area;
	private String city;
	
	public Address(String area, String city) {
		super();
		this.area = area;
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		
		return (area + ", " + city);
	}
	
	
}
