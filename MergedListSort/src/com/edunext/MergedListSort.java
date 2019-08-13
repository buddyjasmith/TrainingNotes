package com.edunext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MergedListSort {
	public static List<Integer> mergeAndSort(List<Integer> listA, List<Integer> listB)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(listA);
		list.addAll(listB);
		Collections.sort(list);
		ArrayList<Integer> listR = new ArrayList<Integer>();
		listR.add(list.get(2));
		listR.add(list.get(6));
		listR.add(list.get(8));
		return listR;
	}
	
	
		public static void main(String[] args) {
	
			Scanner kb = new Scanner(System.in);
			ArrayList<Integer> listA = new ArrayList<Integer>();
			ArrayList<Integer> listB = new ArrayList<Integer>();
			for(int i = 0; i < 5; i++) {
				listA.add(kb.nextInt());
			}
			for(int i = 0; i < 5; i++) {
				listB.add(kb.nextInt());
			}
			List<Integer> list = MergedListSort.mergeAndSort(listA, listB);
			System.out.println(list);
		
		}
}
