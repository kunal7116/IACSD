package assignment2;

public class Product {
	private int pid;
	private int quantity;
	private int price;
	
	public Product() {
	}
	
	public Product(int pid, int quantity, int price) {
		super();
		this.pid = pid;
		this.quantity = quantity;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	

}
