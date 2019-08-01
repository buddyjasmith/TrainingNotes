import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] array = new int[2];
		array[0] = keyboard.nextInt();
		array[1] = keyboard.nextInt();
		boolean flag = (array[0] > array[1]) ? false: true;
		if(!flag) {
			System.out.println("INVALID_INPUTS");
			return;
		}
		System.out.println("BLASH");
		flag =  checkLimits(array[0]);
		if(!flag) {
			System.out.println("INVALID_INPUTS");
			return;
		}
		
		flag = checkLimits(array[1]);
				
		if(!flag) {
			System.out.println("INVALID_INPUTS");
			return;
		}
		int sum = 0;
		for(int i = array[0];i <= array[1];i++) {
			if(findPrimes(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}
	public static boolean checkLimits(int value) {
		return (value >= 3 && value <= 1000) ? true:false;
	}
	
	public static boolean findPrimes(int value) {
	
		for(int i = 2; i <= value / 2;i++) {
			if(value % i == 0) {
				return false;
				}
		}
		
		return true;
	}
	

}
