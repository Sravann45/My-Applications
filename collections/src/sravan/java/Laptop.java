package sravan.java;


public class Laptop  {
	private int price;
	private int ram;
	private String brand;
	
	
	
	public Laptop(int price, int ram, String brand) {
		super();
		this.price = price;
		this.ram = ram;
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int compareTo(Laptop o) {
		
		return this.getPrice()-o.getPrice();
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + ", ram=" + ram + ", brand=" + brand + "]";
	}
	
	

}
