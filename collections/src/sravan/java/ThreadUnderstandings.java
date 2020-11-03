package sravan.java;

public class ThreadUnderstandings extends Thread {
	@Override
	public void run() {
		System.out.println("main run()");

	}

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable Iam in run ()");
			}
		};
		Thread t = new Thread(runnable);
		Thread t1 = new Thread(runnable);
		t.start();

		t1.start();
	}
}
