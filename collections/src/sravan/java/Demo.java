package sravan.java;

interface Demo1 {
	
	//void show(int i,double d);

	void show(int i, double d);

}

 public class Demo{
	public static void main(String[] args) {
		//System.out.println("In");
		 Demo1 d1 = (i,j)->System.out.println(i+10+" "+j); d1.show(9,7);
		 
	}
}
