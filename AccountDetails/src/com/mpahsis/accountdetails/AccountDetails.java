package com.mpahsis.accountdetails;

import java.util.Scanner;

public class AccountDetails {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String row0 = keyboard.nextLine();
		String row1 = keyboard.nextLine();
		
		String[] arr0 = new String[3];
		String[] arr1 = new String[3];
		arr0 = row0.split(" ");
		arr1 = row1.split(" ");
		
		double balance = Double.parseDouble(arr0[0]);
		String accountType = arr0[1];
		double amount = Double.parseDouble(arr0[2]);
		
		Account act1 = new Account(balance,accountType);
		act1.printAccountDetails();
		act1.depositAmount(amount);
		
		balance = Double.parseDouble(arr1[0]);
	    accountType = arr1[1];
		amount = Double.parseDouble(arr1[2]);
		
		Account act2 = new Account(balance,accountType);
		act2.printAccountDetails();
		act2.depositAmount(amount);
	}

}
