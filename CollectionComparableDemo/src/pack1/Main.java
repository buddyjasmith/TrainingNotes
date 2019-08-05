package pack1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(56,"xxx",80));
		list.add(new Student(45,"yyy",90));
		list.add(new Student(88,"zzz",75));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
	}
}
