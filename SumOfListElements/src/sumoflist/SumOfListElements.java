package sumoflist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SumOfListElements {
	public static final List<Integer> nullReturn = null;
	public List<Integer> getSumOfListElements(List<Integer> first,
			List<Integer> second) {
		if((first == null) || second == null) {
			if(first == null && second == null) return Collections.emptyList();
			else if(first == null) 
				return second;
			else if(second == null)
				return first;
		}
		int largest = (first.size() > second.size()) ? first.size() : second.size();
		
		List<Integer> sumList = new ArrayList<Integer>();
		Iterator iterFirst = first.listIterator();
		Iterator iterSecond = second.listIterator();
		int count = 0;
		while(iterFirst.hasNext() || iterSecond.hasNext()) {
			Integer value = (iterFirst.hasNext() && iterSecond.hasNext()) ? 
					        ((Integer)iterFirst.next() + (Integer)iterSecond.next()) :
					        (iterFirst.hasNext()) ? ((Integer)iterFirst.next()) :
					        ((Integer)iterSecond.next());
			
			sumList.add(value);
		
		}
		return sumList;
    
	}

	public static void main(String[] args) {
		List<Integer> first = null;
		List<Integer> second = null;

		String input1 = "", input2 = "";
		if (args.length == 1) {
			first = new ArrayList<Integer>();
			input1 = args[0];
		} else if (args.length == 2) {
			first = new ArrayList<Integer>();
			second = new ArrayList<Integer>();
			input1 = args[0];
			input2 = args[1];
		}

		try {
			String[] ar1 = input1.split(",");
			String[] ar2 = input2.split(",");

			if (!input1.trim().equals("")) {
				for (String s : ar1) {
					first.add(new Integer(s.trim()));
				}
			}
			if (!input2.trim().equals("")) {
				for (String s : ar2) {
					second.add(new Integer(s.trim()));
				}
			}

			SumOfListElements obj = new SumOfListElements();
			System.out.println(obj.getSumOfListElements(first, second));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Invalid input/s.");
		}
	}
}
