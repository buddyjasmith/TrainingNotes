package pack1;

import java.util.ArrayList;import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(1,"Mario",25));
		list.add(new Person(2,"Karol",20));
		Collections.sort(list,new NameComparator());
		Collections.sort(list,new AgeComparator());
		System.out.println(list);

	}

}
