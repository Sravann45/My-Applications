package singleton;

class SingletonTest {

	public static SingletonTest singleObj;

	private SingletonTest() {
		System.out.println("Object created");
	}

	public static synchronized SingletonTest getObj() {

		if (singleObj == null) {
			singleObj = new SingletonTest();
			return singleObj;
		} else

			return singleObj;
	}
}

enum sravan {
	yogi;
}

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				SingletonTest st = SingletonTest.getObj();
				System.out.println(st.hashCode());

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// SingletonTest st1 = SingletonTest.getObj();
				SingletonTest st2 = SingletonTest.getObj();
				System.out.println(st2.hashCode());

			}
		});
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// SingletonTest st1 = SingletonTest.getObj();
				SingletonTest st3 = SingletonTest.getObj();
				System.out.println(st3.hashCode());

			}
		});
		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				// SingletonTest st1 = SingletonTest.getObj();
				SingletonTest st4 = SingletonTest.getObj();
				System.out.println(st4.hashCode());

			}
		});
		Thread t5 = new Thread(new Runnable() {

			@Override
			public void run() {
				// SingletonTest st1 = SingletonTest.getObj();
				SingletonTest st5 = SingletonTest.getObj();
				System.out.println(st5.hashCode());

			}
		});
		Thread t6 = new Thread(new Runnable() {

			@Override
			public void run() {
				// SingletonTest st1 = SingletonTest.getObj();
				SingletonTest st6 = SingletonTest.getObj();
				System.out.println(st6.hashCode());

			}
		});

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}
