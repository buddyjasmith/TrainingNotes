import java.util.Scanner;

public class ColourCodeValidator {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int choice = kb.nextInt();
		boolean choiceBool = (choice == 1) ? true: (choice ==2) ? true : false;
		if(choiceBool == false) {
			System.out.println("Invalid choice");
			return;
		}
		String color = kb.next();
		
		Integer returnValue = null;
		if(choice == 1) {
			returnValue = ColourCodeValidator.validateHexCode(color);
		}else if(choice ==2) {
			returnValue = ColourCodeValidator.validateDecimalCode(color);
		}
		if(returnValue == null)
			System.out.println("Invalid Choice");
		else {
			System.out.println((returnValue == 1) ? ("Valid Code"):("Invalid Code"));
		}
	}
	public static int validateHexCode(String color) {
		color = color.toUpperCase();
		String after0 = color.substring(1);
		boolean firstCheck = (color.length() != 7)? false : (color.charAt(0) != '#')?
							 false : (after0.matches("[A-F]{1,}") || after0.matches("[0-9]{1,}"))?
							 true: false;
		return ((firstCheck == true) ? 1 : -1);
	
	}
	public static int validateDecimalCode(String color) {
		if(color.matches("^rgb\\(\\s*(0|[1-9]\\d?|1\\d\\d?|2[0-4]\\d|25[0-5])%?\\s*,\\s*(0|[1-9]\\d?|1\\d\\d?|2[0-4]\\d|25[0-5])%?\\s*,\\s*(0|[1-9]\\d?|1\\d\\d?|2[0-4]\\d|25[0-5])%?\\s*\\)$")) {
			return 1;
		}else {
			return -1;
			
		}
		
	}
}
