package com.mphasis.exceptionHandling;

public class SumAndAverageOfInputs {

	public static void main(String[] args) {
		double sum =0.0;
		double average = 0.0;
		int numInputs = 0;
		int nonNumInputs = 0;
		int size = 0;
		if(args.length == 0) {
			System.out.println("NO INPUT");
			return;
		}
		

		try {
			size = Integer.parseInt(args[0]);
			args[0] = "Caught";
			if(size < 0) throw new IllegalArgumentException();
		}catch(NumberFormatException e ) {
			System.out.println("FIRST ARGUMENT SHOULD BE A POSITIVE INTEGER");
			return;
		}catch(IllegalArgumentException j) {
			System.out.println("FIRST ARGUMENT SHOULD BE > 0");
			return;	
		}
		try {
			if((size+1) != args.length) 
				throw new IllegalArgumentException();
		}catch(IllegalArgumentException e) {
			System.out.println("INSUFFICIENT INPUTS");
			return;
		}
		for(int i = 1; i < size+1;i++) {
			try {
				sum += Integer.parseInt(args[i]);
				numInputs++;
			}catch(NumberFormatException e) {
				nonNumInputs++;				
			}
		}
	
			average = (double)sum / (double)numInputs;
			System.out.printf("THE SUM IS %.1f",sum);
			System.out.printf("THE AVERAGE IS %.1f",average);
			System.out.printf("NUMBERICAL INPUTS %d",numInputs);
			System.out.printf("NON NUMERICAL INPUTS %d",nonNumInputs);
		
	}

}
