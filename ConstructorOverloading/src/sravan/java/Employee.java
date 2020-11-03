package sravan.java;

public class Employee {
	int id;
	String name;
	
	
	  public Employee() { System.out.println("Emp default"); } 
	 
	
	public Employee(String bykk) {
		System.out.println("value of Bykk is "+bykk);
		System.out.println("Emp String default");// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
		System.out.println("In employee class param constructor");
	}

	@Override
	public String toString() {
		return "Employee [getClass()=" + id + ", hashCode()=" + name + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
