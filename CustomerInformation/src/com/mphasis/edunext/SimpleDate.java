package com.mphasis.edunext;


import java.util.HashMap;

public class SimpleDate {
	private int day;
	private int month;
	private int year;
	static HashMap<Integer, Integer> monthDays = new HashMap<Integer, Integer>();
	public SimpleDate() {
		super();
		setMonthDays();
	}
	public SimpleDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		setMonthDays();
	}
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	@Override
	public String toString() {
		return (day + "/" + month + "/" + year);
	}
	public static void setMonthDays() {
		monthDays.put(1,31);
		monthDays.put(2, 28);
		monthDays.put(3, 31);
		monthDays.put(4,30);
		monthDays.put(5,31);
		monthDays.put(6, 30);
		monthDays.put(7, 31);
		monthDays.put(8,31);
		monthDays.put(9, 30);
		monthDays.put(10, 31);
		monthDays.put(11, 30);
		monthDays.put(12,31);
	}
	public static Integer getMonthDays(int n) {
		if(n <= 12 && n >=1)
			return monthDays.get(n);
		else return null;
		
	}
	public static boolean validateDate(SimpleDate date) {
		if(date == null) 
			return false;
		if((date.getMonth() < 1) && (date.getMonth() > 12))
			return false;
		if(date.getYear() < 2000)
			return false;
		int maxDays = 0;
		try {
		    maxDays = SimpleDate.getMonthDays(date.getMonth());
		}catch(NullPointerException n) {
			return false;
		}
		if((date.getDay() > maxDays) || (date.getDay() < 1))
				return false;
		
		
		return true;
	}
}
