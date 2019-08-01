package com.mphasis.sortnumber;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers {

	public static void main(7String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		//collect num of test cases
		int n = keyboard.nextInt();
	
		
		//test cases between 1 and 20
		if(n >=1 && n <=20) {
			Boolean flag = (n % 2 == 1) ? true : false;
			keyboard.nextLine();
			String sliceMe = keyboard.nextLine();
			sliceMe.trim().replaceAll(" +"," ");
			String[] arr = sliceMe.split(" ");
			if(arr.length != n) {
				System.out.println("INVALID_INPUT");
				return;
			}
			ArrayList<Integer> nums = new ArrayList<Integer>();
			for(String val: arr) {
				nums.add(Integer.parseInt(val));
			}
			if (flag) {
				Collections.sort(nums);
			
				Collections.reverse(nums);
				for(int value : nums)
					System.out.print(vlaue + " ");
			}else {
				Collections.sort(nums);
				
			
				for(int value : nums)
					System.out.print(value + " ");
			}
			
			
			
		}else {
			System.out.println("INVALID_INPUT");
		}
		
		

	}

}
