package sravan.java;

public class StaticBlock {
	
	static {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		System.out.println("bye");
		
	}
	
	static {
		System.out.println("second staic");
	}

}
