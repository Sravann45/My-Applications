package sravan.java;

public class TryCatch {
public static void main(String[] args) {
	int a=10;
	String str = null;
	try {
		int b=a/0;
		System.out.println(str.length());
		
		
	} catch ( ArithmeticException ae) {
		System.out.println("sysout ");
	}
	catch (Exception e) {
		System.out.println("Null");
	}
	
	
	finally {
		System.exit(111111);
		System.out.println("execution of finally");
	}
}
}
