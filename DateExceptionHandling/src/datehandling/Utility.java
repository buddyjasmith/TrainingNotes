package datehandling;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class Utility {
	public static  Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		

	public static int checkDate(String date) {
		int check = 0;
		if(date == null) return -1;
		String[] args = new String[3];
		DateFormat format0= new SimpleDateFormat("dd/MM/yyyy");
		DateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
		DateFormat format2 = new SimpleDateFormat("dd.MM.yyyy");
		format0.setLenient(false);
		format1.setLenient(false);
		format2.setLenient(false);
		try {
			format0.parse(date);
			check = Utility.checkCorrectDate(date);
		}catch(ParseException p) {
			try {
				format1.parse(date);
				check= Utility.checkCorrectDate(date);
			}catch(ParseException p1) {
				try {
					format2.parse(date);
					check = Utility.checkCorrectDate(date);
				}catch(ParseException p2) {
					return -1;
				}
			}
			
		}
		
		return check;
	}
	public static int checkCorrectDate(String date) {
		
		String numberOnly = date.replaceAll("[^0-9]", "");
		if(numberOnly.length() != 8) return -1;
		map.put(1, 31);
		map.put(2,28);
		map.put(3,31);
		map.put(4,30);
		map.put(5,31);
		map.put(6,30);
		map.put(7,31);
		map.put(8,31);
		map.put(9,30);
		map.put(10,31);
		map.put(11,30);
		map.put(12,31);
		int day = 10*Character.getNumericValue( numberOnly.charAt(0));
		day += Character.getNumericValue(numberOnly.charAt(1));
		int month = 10*Character.getNumericValue( numberOnly.charAt(2));
		month +=  Character.getNumericValue(numberOnly.charAt(3));
		if(map.containsKey(month) &&  day <= map.get(month)) return 1;
		else return -1;
		
		
	}

}
