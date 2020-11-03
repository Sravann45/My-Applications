package sravan.java;

class A  extends Employee{
	
	/*
	 * public A() { System.out.println("default construcotr"); }
	 */
	
	/*
	 * public A(String str) { System.out.println("In String Param");
	 * System.out.println("String param"); }
	 */
	
	public A(int a) {
		super();
		System.out.println("integer param");
	}
	
	public A(Object str) {
		System.out.println("In Param");
		System.out.println("Object param");
	}
	
	
}

public class TestingConstructir {

	public static void main(String[] args) {
		//Employee emp = new Employee(null);
		//Employee e = new Employee(1,"Sravan");
	//	@SuppressWarnings("unused")
		
		Employee a = new A(null);
	}
}
