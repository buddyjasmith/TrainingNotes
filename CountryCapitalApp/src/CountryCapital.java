import java.util.HashMap;
import java.util.Map.Entry;

public class CountryCapital {
	public static HashMap<String, String> list = new HashMap<String, String>();
	public static String getCapital(HashMap<String, String> countries, String country) {
		String capital = null;
		if(countries.containsKey(country)) {
			capital = countries.get(country);
		}
		return capital;
	}
	public static String getCountry(HashMap<String, String> countries ,String capital ) {
		
		for(Entry<String, String> entry: countries.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(capital)) {
				return( entry.getKey());
			}
		}
		
		return null;
		
	}
}
