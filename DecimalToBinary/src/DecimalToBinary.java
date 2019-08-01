import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int decimal = keyboard.nextInt();
		if(decimal >=1 && decimal <= 999) {
			int remainder = 0;
			String binary = "";
			while(decimal > 0) {
				
				remainder = decimal % 2;
				binary = Integer.toString(remainder) + binary;
				decimal /= 2;
			}
			System.out.println(binary);
		}else {
			System.out.println("INVALID_INPUT");
		}
	}
}
