package com.mphasis.staticmethods;

import java.util.Scanner;

public class StaticMethods {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int option = kb.nextInt();
		kb.hasNextLine();
		if(option == 1) {
			double fahrenheit = kb.nextDouble();
			System.out.println(Utility.fahrenheitToCelcius(fahrenheit));
		}else
		if(option == 2){
			int numElements = kb.nextInt();
			int[] array = new int[numElements];
			for(int i = 0; i < numElements;i++) {
				array[i] = kb.nextInt();
			}
			System.out.println(Utility.getLevel(array));
		}else {
			System.out.println("Invalid Option");
		}
	}
}
