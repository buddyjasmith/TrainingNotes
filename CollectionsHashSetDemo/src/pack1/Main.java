package pack1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Set<String> hs = new HashSet<String>();
		hs.add("xxx");
		hs.add("yyy");
		hs.add("zzz");
		System.out.println(hs);
		*/
		
		//order is maintained
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("xxx");
		hs.add("zzz");
		hs.add("yyy");
		System.out.println(hs);
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("orange");
		ts.add("apple");
		ts.add("grapes");
		ts.add("papaya");
		ts.add("banana");
		System.out.println(ts);

		
	}

}
