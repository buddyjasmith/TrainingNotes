import java.util.Scanner;
public class StudentsGrade {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		for(int i = 0; i < 3;i++) {
			int temp = keyboard.nextInt();
			if(temp > 100 || temp < 0) {
				System.out.println("INVALIDMARKS");
				return;
			}else {
				sum += temp;
			}
			
		}
		avg = sum / 3;
		if(avg >= 70) {
			System.out.println("DISTINCTION");
		}else
		if(avg >= 60) {
			System.out.println("FIRST");
		}else
		if(avg >= 50) {
			System.out.println("SECOND");
		}else
		if(avg >= 40) {
			System.out.println("THIRD");
		}else {
			System.out.println("FAIL");
		}

	}

}
