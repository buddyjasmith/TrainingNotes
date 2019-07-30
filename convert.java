import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int decimal = keyboard.nextInt();
		int remainder = 0;
		String binary = "";
		while(decimal > 0) {
			System.out.println("Oops");
			remainder = decimal % 2;
			binary = Integer.toString(remainder) + binary;
			decimal /= 2;
		}
		System.out.println(binary);
	}
	public static String twosComplement(String num){
		
	}

}
