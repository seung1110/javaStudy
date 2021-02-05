package kosta.oop;

public class BookMain {

	public static void main(String[] args) {
		Book books[] = {new Book("JAVA",30000),new Book("JSP",25000),new Book("Oracle",15000)};
		int total = 0;
		for(Book b : books) {
			b.dc();
			b.print();
			total += b.disPrice;
		}
		System.out.println("총 금액 : " + total+"원");
	}



}
