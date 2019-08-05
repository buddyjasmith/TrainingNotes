package com.mphasis.edunext;

import java.util.Scanner;

public class CustomerInformation {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String firstLine = keyboard.nextLine();
		String secondLine = keyboard.nextLine();
		
		String[] first = firstLine.split(" ");
		String[] second = secondLine.split(" ");
		int month = keyboard.nextInt();
		int day = keyboard.nextInt();
		int year = keyboard.nextInt();
		int id = Integer.parseInt(first[0]);
		String name = first[1];
		String area = second[0];
		String city = second[1];
		Address address = new Address(area, city);
		SimpleDate date = new SimpleDate(day, month, year);
		Customer customer = new Customer(id, name, address,date);
		System.out.println(customer.toString());
		
		keyboard.close();
	}
}
