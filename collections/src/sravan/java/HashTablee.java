package sravan.java;

import java.util.*;

public class HashTablee {
	public static void main(String[] args) {
		Map map = new Hashtable();
		
		map.put("c","third");
		map.put("u","four");
		map.put("a", "first");
		map.put("a", "firsttt");
		map.put("b","second");
		map.put("e","fifth");
		/*
		 * map.put(null, 123); map.put(null, 100);
		 */
		
		System.out.println(map);
	}

}
