package sravan.java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Car implements InterfaceJava88 {
	
	  public static void main(String[] args) { System.out.println("hello"); 
	
	  Car c = new Car();
	  c.print();
	  LocalDate today = LocalDate.now();
	  LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
	  System.out.println("Next month: " + nextMonth);
	  
	 // Instant now = today.toInstant();
		/*
		 * Random random = new Random();
		 * random.ints().limit(10).forEach(System.out::println);
		 */
	  }
	 
	
}
