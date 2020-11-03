package sravan.java;

abstract class Abstract {

	public Abstract() {
		System.out.println("Iam in Abstract class");
	}

	public Abstract(int a) {
		System.out.println("Iam in Abstract class parameterized " + a);
	}
}

class Aa extends Abstract {

	
	public Aa(int a) {

		super(3);

		System.out.println("Class Aa constructor");

	}

	public Aa() {
		super();
		System.out.println("class A");
	}
}

public class TestAbstract {
	public static void main(String[] args) {
		Aa abs = new Aa(3);
		{
		}
		;
	}
}
