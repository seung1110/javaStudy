package kosta.oop;

public class Book {
	String name;
	int price;
	int disPrice;
	
	public Book() {}
	
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void dc() {
		if( price >= 30000)
			disPrice = (int)(price*0.75);
		else if ( price >= 20000)
			disPrice = (int)(price*0.80);
		else if( price >= 15000)
			disPrice = (int)(price*0.85);
	}
	
	public void print() {
		System.out.println(name + "교재는 정가는 "+price +" 할인된 가격은 "+disPrice+"원 입니다.");
	}
	
}
