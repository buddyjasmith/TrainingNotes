import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {
		int[] array = new int[3];
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0;i < 3;i++) {
			array[i] = keyboard.nextInt();
		}
		boolean flag = (array[0] < array[1] || array[1] < array[2] || array[0] < array[2])
					  ? true:false;
		if(flag) {
			System.out.println("INVALID_INPUT");
			return;
		}
		int checkPyth = (int)Math.pow(array[1], 2.0) + (int)Math.pow(array[2], 2.0);
		if(checkPyth != ((int)Math.pow(array[0], 2.0))) {
			System.out.println("NOT RIGHT ANGLE TRIANGLE");
		}else {
			System.out.println("RIGHT ANGLE TRIANGLE");
		}

	}

}
