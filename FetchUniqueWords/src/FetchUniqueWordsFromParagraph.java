import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
public class FetchUniqueWordsFromParagraph {
	public static final List<String> nullList = null;
	public static void main(String[] args) {
		try {
			String paragraph = args[0];
			int mode = Integer.parseInt(args[1]);
			FetchUniqueWordsFromParagraph obj = new FetchUniqueWordsFromParagraph();
			System.out.println(obj.fetchUniqueWords(paragraph, mode));
		} catch (NumberFormatException e) {
			System.out.println("Invalid mode. Expecting an int");
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid number of arguments. Expecting a string and a number");
		}

	}
@SuppressWarnings("unchecked")
public List<String> fetchUniqueWords(String paragraph, int mode) {
		
		// STUDENT CODE BEGINS HERE

		List<String> str = new ArrayList<String>();
		TreeSet<String> tree = new TreeSet<String>();
		paragraph =paragraph.replace("-", " ");
		paragraph =paragraph.replace(",", " ");
		paragraph = paragraph.replace(".", " ");
		paragraph = paragraph.replace(" +", " ");
		
		String[] splits = paragraph.split(" ");
		
		for(String split: splits ) {
			tree.add(split);
			System.out.println(split);
		}
		str =  new ArrayList<String>(tree);
		str.removeAll(Arrays.asList("",null));
		if(mode == 1) {
			
			return str;
		}else 
		if(mode == 2){
			Collections.sort(str, new Comparator<String>() {
			    @Override
			    public int compare(String o1, String o2) {
			        return o1.length() - o2.length();
			    }
			});
			return str;
		}
		else {
			return nullList;
		}
	
		
		// STUDENT CODE ENDS HERE
	}


}
