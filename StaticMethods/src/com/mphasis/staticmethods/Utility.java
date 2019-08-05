package com.mphasis.staticmethods;

public class Utility {
	public static int fahrenheitToCelcius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		return (int) Math.round(celsius);
	}
	public static String getLevel(int[] array) {
		int sum = 0;
		for(int element : array) {
			sum += element;
		}
		return(sum >= 100) ? "HIGH" : (sum >= 70) ? "MEDIUM" :"LOW";
		}
}
