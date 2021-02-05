package kosta.oop;

public class Product {
	int price, amount;
	String productName;
	
	public Product() {}

	public Product(int price, String productName) {
		super();
		this.price = price;
		this.productName = productName;
	}

	
	public boolean equal(Product p1) {
		if(this.price == p1.price && true == this.productName.equals(p1.productName))
			return true;
		else 
			return false;
	}
	
	public void print() {
		System.out.println(this.productName + "\t\t"+this.price);
	}

}	
