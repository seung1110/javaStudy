package kosta.hotel;

public class Pay {

	
	public void payCash(int price) {
		System.out.println("          영수증"
				+ "\n현금결제 : " + price + "원");
	}
	public void payCard(int price,String custCard) {
		System.out.println("          영수증"
				+ "\n카드결제 : " + price + "원");
	}
}
