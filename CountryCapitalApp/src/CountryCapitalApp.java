import java.util.HashMap;
import java.util.Scanner;

public class CountryCapitalApp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		 HashMap<String, String> cc = new HashMap<String, String>();
		 int n = kb.nextInt();
		 String country, capital;
		 for(int i = 0; i < n;i++) {
			country = kb.next();
			capital = kb.next();
			cc.put(country, capital);
		 }
		 n = kb.nextInt();
		 if(n==1) {
			 country = kb.next();
			 
			 capital = CountryCapital.getCapital(cc, country);
			 if(capital == null) System.out.println("Country not found");
			 else System.out.println("Capital : " + capital);
		 }else if (n==2) {
			 capital = kb.next();
			 
			 country = CountryCapital.getCountry(cc, capital);
			 if(country == null) System.out.println("Capital not found");
			 else System.out.println("Country : " + country);
			
		 }
	}

}
