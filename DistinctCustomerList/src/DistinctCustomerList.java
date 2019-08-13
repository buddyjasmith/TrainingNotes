import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class DistinctCustomerList {
	private final static Integer[] emptyArray = new Integer[0];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		List<Integer> list0 = new ArrayList<Integer>();
		
		for(int i = 0; i < n;i++) {
			list0.add(kb.nextInt());
		}
		List<Integer> list1 = new ArrayList<Integer>();
		int m = kb.nextInt();
		for(int i = 0;i < m;i++) {
			list1.add(kb.nextInt());
		}
		Integer[] nonDup = DistinctCustomerList.getDistinctCustomers(list0, list1);
		System.out.println((nonDup== null)? Arrays.toString(emptyArray) : Arrays.deepToString(nonDup));
	}
	public static Integer[] getDistinctCustomers(List<Integer> l1, List<Integer> l2)
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(Integer value : l1)
			if(!l2.contains(value)) {
				ts.add(value);
			}
		for(Integer value : l2) {
			if(!l1.contains(value))
				ts.add(value);
		}
		TreeSet<Integer> revset = null;
		Integer[] retArray = null;
		try{
			revset = (TreeSet<Integer>)ts.descendingSet();
			retArray = revset.toArray(new Integer[revset.size()]);
		}catch(NullPointerException e) {
			return emptyArray;
		}
		return (retArray== null)? emptyArray : retArray;
		
	}
}
