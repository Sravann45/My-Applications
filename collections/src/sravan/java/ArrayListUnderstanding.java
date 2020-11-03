package sravan.java;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;




public class ArrayListUnderstanding {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>();
		//List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(5);
		
		/*
		 * Iterator<Integer> it = list.iterator(); while (it.hasNext()) { Integer
		 * integer = (Integer) it.next(); list.add(2); System.out.println(integer); }
		 */
	ListIterator<Integer> li = list.listIterator();
	while (li.hasNext()) {
			/* Integer integer = (Integer) li.next(); */
		list.add(6);
		System.out.println(li.next());
	}
	System.out.println(list);
	}
}
