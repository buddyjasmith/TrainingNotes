package com.edunext.customerexception;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String name = sc.next();
		String date = sc.next();
		Customer customer = new Customer(id,name,date);
		try {
			System.out.println(customer.doRegister());
		} catch (InvalidRegistrationException | LateRegistrationException e) {
			// TODO Auto-generated catch block
			
		}
	}

}
