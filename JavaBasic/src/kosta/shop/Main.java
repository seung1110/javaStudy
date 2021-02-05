package kosta.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Product p[] = { new Phone(1, 990000, 25, 0, "갤럭시S21"), new Phone(2, 1100000, 20, 0, "아이폰12"),
				new Phone(3, 1400000, 10, 0, "갤럭시Z플립"), new Phone(4, 1400000, 20, 0, "LG Wing"),
				new NoteBook(5, 700000, 10, 0, "Asus 비보북"), new NoteBook(6, 820000, 15, 0, "레노버"),
				new NoteBook(7, 1300000, 15, 0, "LG그램15"), new NoteBook(8, 1500000, 10, 0, "갤럭시북") };

		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();


		while (true) {
			System.out.println("********************상품 목록********************");
			for (Product i : p)
				i.print();
			System.out.println();
			System.out.println("1. 장바구니 추가   2. 장바구니 목록    3.종료");
			String ans = sc.nextLine();
			
			if (ans.equals("1")) {
				System.out.print("추가할 상품의 번호를 입력해주세요. : ");
				int choice = sc.nextInt();
				choice -=1;

				System.out.print("상품의 수량을 입력해주세요 : ");
				int amount = sc.nextInt();
				sc.nextLine();
				Product temp = null;
				if(p[choice] instanceof Phone) {
					Phone ph = (Phone)p[choice];
					ph.setAmount(amount);
					temp = ph;
				}
				else if(p[choice] instanceof NoteBook) {
					NoteBook no = (NoteBook)p[choice];
					no.setAmount(amount);
					temp = no;
				}
				cart.addProduct(temp);
			

				
			} else if (ans.equals("2")) {
				cart.printCart();
			} else if (ans.equals("3")) {
				System.out.println("시스템을 종료합니다.");
				return;
			}

		}

	}

}
