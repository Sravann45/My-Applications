package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
		
	
	List<String> names = new ArrayList<String>();
    
	names.add("A");  
	names.add("B");  
	names.add("999");  //Incorrect
	names.add("C");  //Incorrect
	 
	String regex = "[0-9]{3}";
	 
	Pattern pattern = Pattern.compile(regex);
	 
	for (String name : names)
	{
	    Matcher matcher = pattern.matcher(name);
	    System.out.println(matcher.matches());
	}

}
}
