package com.mphasis.stack;

import java.util.Stack;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<String> s1 = new Stack<String>();
		
		s1.add("Java");
		((Stack<String>) s1).push("Source");
		s1.add("C++");
		s1.add("Python");

	}

}
