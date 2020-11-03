package sravan.java;

import java.util.*;

public class ListExample {
	
	public static void main(String[] args) {
		
		List<Integer>  list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		/*
		 * //Prior to Java 8 for(Integer i:list) { System.out.println(i); }
		 * 
		 * Iterator< Integer> it = list.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next());
		 * 
		 * }
		 */
		
		//Lamba Expression
		list.forEach(l->System.out.println(l));
		list.forEach(System.out::println);
		
	}

}
