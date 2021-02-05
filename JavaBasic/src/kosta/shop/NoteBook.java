package kosta.shop;

public class NoteBook implements Product{
	private int no,price,dc,amount;
	private String name;
	
	public NoteBook() {}
	
	

	public NoteBook(int no, int price, int dc, int amount, String name) {
		super();
		this.no = no;
		this.price = price;
		this.dc = dc;
		this.amount = amount;
		this.name = name;
	}



	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDc() {
		return dc;
	}

	public void setDc(int dc) {
		this.dc = dc;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void printInfo() {
		System.out.println(no + "\t"+name+"\t"+price+ "\t"+dc+"%"+ "\t"+amount);
		
	}



	@Override
	public void discount() {
		this.price *= ((100-this.dc) / 100.0);
		
	}



	@Override
	public void print() {
		System.out.println(no + "\t"+name+"\t"+price+ "\t"+dc+"%");
		
	}	
	

}
