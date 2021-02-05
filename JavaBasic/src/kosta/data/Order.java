package kosta.data;

import java.util.ArrayList;

public class Order {
	private Food f;
	private int amount;
	private int total;
	private ArrayList<Food> foodList = new ArrayList<Food>();
	
	public Order() {}

	public Order(Food f, int amount) {
		super();
		this.f = f;
		this.amount = amount;
		total = f.getPrice() * this.amount;
	}

	@Override
	public String toString() {
		return  f.getFoodName() +" "+ amount + "개" + "  총 금액 : " + total;
	}

	public Food getFood() {
		return f;
	}

	public void setFood(Food f) {
		this.f = f;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getTotal() {
		return this.total;
	}
	
}
