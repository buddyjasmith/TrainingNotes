package pack1;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(1, "Drew");
		hm.put(2,"Dang");
		hm.put(3,"AAA");
		hm.put(null,null);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		for(Integer i : hm.keySet()) {
			System.out.println("key "+ i+ " " +hm.get(i));
		}
	}
}
