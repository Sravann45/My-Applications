package sravan.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapp{

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("FB", 1);
		map.put("Ea", 2);
		
		//Lambda Expression
		map.forEach((k,v)->System.out.println(k +" "+v));
		
		//Prior Java 8
		Set<Entry<String,Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> mapEntry:set) {
			System.out.println(mapEntry.getKey() +" "+ mapEntry.getValue());
		}
		
		
		
		
	}
	

}
