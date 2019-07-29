import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number = keyboard.nextInt();
		int original = number;
		int arm_num = 0;
		int n = String.valueOf(number).length();
		
		while(number > 0) {
			arm_num += Math.pow(number % 10, n);
			number /= 10;
			
		}
		System.out.println(arm_num);
		if(arm_num == original)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong");
		
		
	}
}
C:\Users\buddy.smith\TrainingNotes\TrainingNotes\DrewSmithSection1.sql