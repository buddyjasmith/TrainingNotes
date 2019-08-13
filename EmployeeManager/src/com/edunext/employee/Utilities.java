package com.edunext.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
	public static Date stringToDate(String date) {
		if(date.length() == 0) return null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		format.setLenient(false);
		Date returnDate = null;
		
		try {
			returnDate = format.parse(date);
			System.out.println("This never gets called");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return returnDate;
	}
}
