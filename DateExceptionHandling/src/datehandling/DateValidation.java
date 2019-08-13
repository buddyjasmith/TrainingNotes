package datehandling;

import java.util.Scanner;

public class DateValidation {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String date = kb.nextLine();
		int dateValidity = Utility.checkDate(date);
		System.out.println((dateValidity == 1) ? "Valid":"Invalid");

	}

}
