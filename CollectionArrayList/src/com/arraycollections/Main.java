package com.arraycollections;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		//will run with 
		List list = new ArrayList();
		list.add(15);
		list.add(12.5F);
		list.add(15.50);
		list.add("aaa");
		list.add(false);
		System.out.println(list);
		
		//Collection of only string
		List<String> alist = new ArrayList<String>();
		alist.add("pink");
		alist.add("two");
		
		//Adding obects using index values
		alist.add(0,"ABAB");
		alist.add(2,"MNMN");
		System.out.println(alist);
		
	}
}
