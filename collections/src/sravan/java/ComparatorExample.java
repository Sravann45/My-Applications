package sravan.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Laptop> list = new ArrayList<Laptop>();
		list.add(new Laptop(100, 32, "UVA"));
		list.add(new Laptop(200, 12, "TF"));
		list.add(new Laptop(300, 24, "ABC"));
		//list.add(new Laptop(200, 12, "TF"));
		
		Comparator<Laptop> comparator = new Comparator<Laptop>() {
			
			@Override
			public int compare(Laptop o1, Laptop o2) {
				if(o1.getPrice() < o2.getPrice()) {
					return 1;
				}else
					return -1;
				//return 0;
			}
		};
		 Collections.sort(list,comparator);
		//System.out.println(list);
		
		 for(Laptop l:list) { System.out.println(l); }
		
		
		
	}

}
