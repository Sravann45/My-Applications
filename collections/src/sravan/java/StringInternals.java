package sravan.java;

import java.util.HashMap;
import java.util.Map;

class MyDemo {
	
	@Override
	public int hashCode() {
		System.out.println("iam in hashcode()");
		return super.hashCode();
	}
}

public class StringInternals {
	
	
	
	public static void main(String[] args) {
		/*
		 * String str = "Sravan"; str.hashCode(); str.hashCode(); str.hashCode();
		 * System.out.println(str.hashCode());
		 * 
		 * String strg = new String("Sravan"); strg.hashCode();
		 * System.out.println(strg.hashCode()); System.out.println(str==strg);
		 */
		String sre = "Sravan";
		String str = new String("Sravan");
		//sre.concat("Addani");
		
		//str.substring(0, 4);
		System.out.println("Concatination : "+str.substring(0, 4)+" : "+sre);
		if(str==sre) {
			System.out.println("both are same reference");
		}else {
			System.out.println("not same reference");
		}
	}

}
