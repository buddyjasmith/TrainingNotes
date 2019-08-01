import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String possibleArm = keyboard.nextLine();
		
		int n = Integer.parseInt(possibleArm);
		int original = n;
		if(possibleArm.length() != 3) {
			System.out.println("INVALID_INPUT");
			return;
		}
		int mod;
		int check=0;
		while(n >0) {
			check += Math.pow((n%10), possibleArm.length());
			
			n /= 10;
		}
		if(check == original) System.out.println("ARMSTRONG");
		else System.out.println("NOT ARMSTRONG");
		
		

	}

}
