package comparator;

import java.util.*;

public class ComparatorUnderstanding {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(110, "Chinni"));
		list.add(new Student(101, "Chikki"));
		list.add(new Student(110, "Harshu"));
		
		/*
		 * Comparator<Student> c = new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) {
		 * if(o1.getSid()>o2.getSid()) { return 1; }else if(o1.getSid()<o2.getSid()) {
		 * return -1; } else return 0; } };
		 * 
		 * 
		 * 
		 * Collections.sort(list, c); for(Student s:list) {
		 * System.out.println("Student details are "+s); }
		 */
		
		
		
		Collections.sort(list);
		for(Student s:list) {
			System.out.println(s);
		}
		
	}
}
