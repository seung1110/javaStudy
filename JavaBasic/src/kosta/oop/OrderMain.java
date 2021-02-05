package kosta.oop;

import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {
		Product[] pr = {new Product(1500,"pr1"),
				new Product(2000,"pr2"),
				new Product(1000,"pr3"),
				new Product(500,"pr4"),
				new Product(1200,"pr5")};
		Order or = new Order();
		
		System.out.println(or.ch);
		System.out.println(or.by);

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 : ");
		or.customerName = sc.nextLine();
		while(true) {
			System.out.println("상품명\t가격");
			for(Product a : pr)
				a.print();
			
			System.out.println("구매할 물건의 이름과 수량을 입력해주세요.(종료는 0번)");
			String temp = sc.nextLine();
			String[] ar = temp.split(" ");
			
			if(ar.length >1 && Integer.parseInt(ar[1]) == 0)
				break;
			else if(ar.length == 1 && Integer.parseInt(ar[0]) == 0)
				break;
			
			for(Product a : pr)
				if(a.productName.equals(ar[0])) {
					a.amount += Integer.parseInt(ar[1]);
					or.addProduct(a);
					break;
				}
			
		}
		or.calTotal();
		or.printOrder();
	}

}
