
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTheList {

	public List<String> sort(String input) {
		// Student code begins here
	
		List<String> list1 = new ArrayList<String>();
		try {
		list1 = Arrays.asList(input.split(" "));
		}catch(NullPointerException n) {
			List<String> ret = new ArrayList<String>();
			return ret;
		}
		  Collections.sort(list1, new Comparator<String>() {

	            @Override
	            public int compare(String o1, String o2) {
	                if(o1.length()>o2.length()){
	                    return 1;
	                }else if(o1.length() == o2.length()){
	                    return 0;
	                }else {
	                	return -1;
	                }
	            }
	        });
		
		
		return list1;
		
	}

	public void printSorted(String input) {
		System.out.println(sort(input));
	}

	public static void main(String[] args) {
		String input = "";
		
		for (int i = 0; i < args.length; i++) {
			input += args[i] + " ";
		}
		input = input.trim();
		
		if(input.equals("null")){
			input = null;
		}
		SortTheList obj = new SortTheList();
		obj.printSorted(input);
	}

}