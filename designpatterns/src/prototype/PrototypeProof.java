package prototype;

public class PrototypeProof {
public static void main(String[] args) throws CloneNotSupportedException {
	BookShop bs =new BookShop();
	bs.setShopName("Harshika");
	bs.getBooks();
	//System.out.println(bs);
	
	BookShop bs1 = (BookShop)bs.clone();
	bs.getBook().remove(1);
	bs1.setShopName("Chikki");
	System.out.println("initial object "+bs.toString().length());
	
	System.out.println("cloneable object "+bs1);
}
}
