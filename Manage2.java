package FinalReview;

import java.util.Map;
import java.util.TreeMap;

public class Manage2 {

	public static void main(String[] args) {
		String sOrg= "where the first argument is the key and the second argument is the value. To remove"
				+ "an entry, we use the remove method with the key of an entry to remove from the"
				+ "map, for example";
		
		sOrg=sOrg.toLowerCase();
		String[]  s = sOrg.split(" ");
		
		Map<String,Integer> table;
		table = new TreeMap<String,Integer>( );
		
		for(String i: s) {
			if (table.containsKey(i)) {
				table.put(i, table.get(i)+1);
				
			} else {
				table.put(i, 1);
			}
		}
		
		System.out.println(s.length +"----" +table.size());
		for(String keys: table.keySet()) {
			System.out.println(keys + ":"  + table.get(keys));
		}
		

		
	}

}
