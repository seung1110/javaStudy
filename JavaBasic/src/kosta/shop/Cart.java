package kosta.shop;

import java.util.ArrayList;

public class Cart {
	
	private ArrayList<Product> cart = new ArrayList();
	
	public Cart() {}
	
	public void addProduct(Product p ) {
		int check = 0;
		for(Product i : cart) {
			if(i.getName().equals(p.getName())) {
				if(i instanceof Phone) {
					((Phone) i).setAmount(((Phone) i).getAmount()+1);
					check +=1;
					break;
				}
				if(i instanceof NoteBook) {
					((NoteBook) i).setAmount(((NoteBook) i).getAmount()+1);
					check +=1;
					break;
				}
				
			}

		}
		if(check == 0) {
			cart.add(p);

		}
	}
	
	public void printCart() {
		if(cart.size() == 0) {
			System.out.println("장바구니가 비어있습니다.");
		}
		else {
			int sum = 0;
			System.out.println("번호\t상품명\t가격\tdc%\t수량");
			for(Product p : cart) {
				
				if(p instanceof Phone) {
					p.printInfo();
					p.discount();
					((Phone) p).getPrice();
					sum += ((Phone) p).getAmount()*((Phone) p).getPrice();
					}
				
				if(p instanceof NoteBook){
					p.printInfo();
					p.discount();
					sum += ((NoteBook) p).getAmount()*((NoteBook) p).getPrice();
				}
				
			}
			System.out.println("전체 가격 : " + sum);
		}
	}
}
