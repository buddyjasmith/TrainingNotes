package pack1;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		try {
			int n1  = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			result = n1/n2;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid command line arguments");
		}catch(ArithmeticException f) {
			System.out.println("Divide by zero Exception!");
		}catch(NumberFormatException e2) {
			System.out.println("Incorrect number formate");
		}finally {
			System.out.println(result);
		}
		System.out.println("Good Bye");
		
	}

}
