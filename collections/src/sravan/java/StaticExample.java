package sravan.java;

class Emplaoyee{
	static Integer empid=1;
	static String name;
	static String ceo;
	
	static {
		System.out.println("firststatic");
		ceo="Robot";
	}
	
	public static void say() {
		System.out.println("Hello");
System.out.println("Address "+addr);	}
	
	public void show(	) {
		++empid;
		System.out.println(empid+" : "+name.hashCode()+" : "+ceo);
			}
	static String addr="mbnr";
}

public class StaticExample {
	//static int empid=1;
	
	public static void main(String[] args) {
		Emplaoyee e = new Emplaoyee();
		
		/*e.empid=1;
		e.name="Sravan";
		e.ceo="Addani";
		
		
		
		e.show();
		e.show();*/
		//empid=1;
		
		
		Emplaoyee ee = new Emplaoyee();
		Emplaoyee ee2 = new Emplaoyee();
		Emplaoyee ee3 = new Emplaoyee();
		Emplaoyee ee4 = new Emplaoyee();Emplaoyee ee5 = new Emplaoyee();
		
		//Emplaoyee.empid=2;
		Emplaoyee.name="Addani";
		//ee.ceo="SRN";
		e.show();
		ee.show();ee2.show();ee3.show();ee4.show();ee5.show();
		System.out.println("in Main: "+Emplaoyee.addr);

		Emplaoyee.say();
	}

}
