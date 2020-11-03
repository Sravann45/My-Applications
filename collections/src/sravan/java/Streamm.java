package sravan.java;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamm {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 2, 2);

		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i+i).distinct().collect(Collectors.toList());
		Predicate<Integer> predicte = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				
				return t%5==0;
			}
		};
		Function<Integer, Integer> function = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return t+2;
			}
		};
		//System.out.println(numbers.stream().map(i->i+2).collect(Collectors.toList()));
		//numbers.stream().map(i->i+2).forEach(x->System.out.println(" "+x));
		
		//System.out.println("Final Result "+numbers.stream().map(i->i+2).filter(t->t%5==2).collect(Collectors.toList()));
		//System.out.println(squaresList);
		
		List<Integer> number = Arrays.asList(2,1,8);
		
		//System.out.println("basic Filter "+number.stream().filter(x->x%2==0).collect(Collectors.);
		
		BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};		

		System.out.println("Reduce "+ number.stream().map(i->i+2).filter(i->i%2==0).reduce(7,(c,e)->c+e));
		
	}
}
