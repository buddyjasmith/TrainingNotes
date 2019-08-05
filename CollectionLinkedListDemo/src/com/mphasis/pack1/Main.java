package com.mphasis.pack1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("Orange");
	list.add("Apple");
	list.add("Banana");
	System.out.println("Size " + list.size());
	ListIterator<String> iter = list.listIterator();
	System.out.println("Printing in forware direction");
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	}
}
