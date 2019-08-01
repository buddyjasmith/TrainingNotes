

import java.util.Scanner;

public class FindMaxMinAge {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int max = -2147483648;
		int min = 2147483647;
		//Read n number and parse to int
		
		int num = keyboard.nextInt();
		keyboard.nextLine();
		
		
		//Check range
		if(num >= 1 && num <= 20) {
		// Red input numbers and remove excessive white space
		String sliceMe = keyboard.nextLine();
		sliceMe = sliceMe.trim().replaceAll(" +", " ");
		
		//Close scanner
		keyboard.close();
		String[] strArray = sliceMe.split(" ");
			//check input 
			if(strArray.length == num) {
				
				for(int i = 0;i < num;i++) {
					int temp = Integer.parseInt(strArray[i]);
					if(temp > max) max = temp;
					if(temp < min) min = temp;
				}
				System.out.println("MIN=" + min);
				System.out.println("MAX="+max);
			}
			else
				System.out.print("INVALID_INPUT");
		}else {
			System.out.print("INVALID_INPUT");
		}
		

	}//Close main
}
