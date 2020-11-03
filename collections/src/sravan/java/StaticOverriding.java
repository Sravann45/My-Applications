package sravan.java;

class A {

	public static void say() {
		System.out.println("in say of class A");
	}

	public void display() {
		System.out.println("Parent display");
	}

	public static void say(String name) {
		System.out.println("hello in A oveloaded method");
	}
}

class B extends A {

	public B() {
		System.out.println("B class constructor");
	}

	public static void say() {
		System.out.println("in say of class B");
	}

	@Override
	public void display() {
		System.out.println("Child display");
	}

	public static void say(String name) {
		System.out.println("hello in B oveloaded method");
	}

}

public class StaticOverriding {

	public static void main(String[] args) {
		A a = new B();
		a.display();
		a.say();
	}
}
