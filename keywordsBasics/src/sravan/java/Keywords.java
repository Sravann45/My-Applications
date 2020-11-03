package sravan.java;

class A {

	public A() {
		System.out.println("In class A constructor");
	}

	public A(int a) {
		System.out.println("Class A value of a : " + a);
	}
}

class B extends A {
	public B() {
		System.out.println("In class B Constructor");
	}

	public B(int a) {
		System.out.println("Class B value of a : " + a);
	}
}

public class Keywords {

	public static void main(String[] args) {
		B b = new B(3);

	}

}
