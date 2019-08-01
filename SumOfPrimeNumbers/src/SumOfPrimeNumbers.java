import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] array = new int[2];
		array[0] = keyboard.nextInt();
		array[1] = keyboard.nextInt();
		boolean flag = (array[0] < array[1]) ? true: false;
		flag = (array[0] < 3 && array[0] > 1000) ? false:true;
		flag = (array[1] < 3 && array[1] > 1000) ? false:true;
		
		
	}

}
