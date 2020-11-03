package sravan.java;

interface ImpleInterface {

	void show();

	void display();

}

class ImpleInterfaceA implements ImpleInterface {

	@Override
	public void display() {
	System.out.println("iam in display()");
		// TODO Auto-generated method stub
		
	}
	
	
	  @Override public void show() { // TODO Auto-generated method stub
	  System.out.println("iam in show()");
	  }
	 
}

class ImpleInterfaceB extends ImpleInterfaceA implements ImpleInterface {

	public void sh() {
		System.out.println("iam in sh()");
	}
}

public class InterfaceUnderstanding {
	public static void main(String[] args) {
		
	}

}
