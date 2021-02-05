package kosta.oop;

public class Order {
	Product[] products = new Product[0];   // default constructor로 초기화할 경우 배열 메모리 할당이 안되므로 기본 0 설정
	String customerName;
	int orderNo, total = 0;
    byte by;
    char ch;
	public Order() {	}
	
	public void addProduct(Product pr) {
		Product[] temp = new Product[products.length+1];
		if(products.length == 0) {
			temp[0] = pr;
			products = temp;
		}
		else {
			System.arraycopy(products, 0, temp, 0, products.length);
			temp[temp.length-1] = pr;
			products = temp;
		}
		
	}
	
	public void delProdcut(Product pr) {
		int temp = 0;
		Product[] arr = new Product[products.length - 1];
		for(int i = 0; i < products.length; i++) {
			if(pr.equal(products[i])) {
				temp = i;
				break;
			}
		}
		System.arraycopy(products, 0, arr, 0, temp);
		System.arraycopy(products, temp+1, arr, 0, products.length-(temp+1));
		products = arr;
	}
	public void calTotal() {
		for(Product pr : products) {
			this.total += pr.amount * pr.price;
		}
	}
	public void printOrder() {
		System.out.println("주문 목록\t" + this.customerName+ "님");
		System.out.println("제품명\t수량\t가격");
		for(Product pr : products)
			System.out.println(pr.productName + "\t\t" + pr.amount + "\t" + pr.price);
		
		System.out.println("총 금액 : " + this.total + "원입니다.");
	}
}
