import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int decimal = keyboard.nextInt();
		int remainder = 0;
		String binary = "";
		while(decimal != 0) {
			System.out.println("Oops");
			remainder = decimal % 2;
			binary = Integer.toString(remainder) + binary;
			decimal /= 2;
		}
		System.out.println(binary);
		if(decimal < 0) binary = oneComplement(binary);
		System.out.println(binary);
	}
	public static String oneComplement(String num){
		String returnValue="";	
		for(int i = 0; i < num.length();i++){
			char temp = num.charAt(i);
			returnValue  += (temp == '1' ? '0':'1');
		}
		
		return returnValue;
	}

}
