package prototype;

import java.util.*;

public class BookShop implements Cloneable{
	private String shopName;
	private List<Book> book = new ArrayList<>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", book=" + book + "]";
	}
	public void getBooks() {
		for(int i=1;i<10;i++) {
			Book b = new Book();
			b.setBid(i);
			b.setBname("Book"+i);
			getBook().add(b);
		}
	}
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop shop = new BookShop();
		for(Book b:this.getBook()) {
			shop.getBook().add(b);
		}
		// TODO Auto-generated method stub
		return shop;
	}
	
}
