package kosta.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Food> fArr = new ArrayList<Food>();
		fArr.add(new Food("치킨", 18000));
		fArr.add(new Food("피자", 21000));

		Food f[] = { new Food("치킨", 18000), new Food("피자", 21000), new Food("사이다", 1500) };
		Queue<Order> orders = new LinkedList<Order>();
		int total = 0;

		while (true) {
			System.out.println("1. 주문 요청  2. 주문 처리   3. 매출액 총액   4. 종료 5. 처리하지 못한 주문 목록");
			switch (sc.nextLine()) {
			case "1":
				System.out.println("주문할 메뉴를 선택해주세요.\n1.치킨 2. 피자 3. 사이다");
				int menu = sc.nextInt() - 1;
				if (menu < 1 && menu > 3) {
					System.out.println("존재하지 않는 메뉴입니다.");
					System.out.println();
					break;
				}
				System.out.print("주문할 수량을 입력해주세요 : ");
				int amount = sc.nextInt();
				sc.nextLine();
				if (orders.offer(new Order(f[menu], amount))) {
					System.out.println("주문에 성공하였습니다.");
				} else {
					System.out.println("주문에 실패하였습니다.");
				}
//				if(orders.offer(new Order(fArr.get(menu),amount)))
//					System.out.println("주문에 성공하였습니다.");
				break;
			case "2":
				if (!orders.isEmpty()) {
					Order com = orders.remove(); // poll이 더 queue에 가까움
					System.out.print("처리된 주문 : ");
					System.out.println(com);
					total += com.getTotal();
				} else {
					System.out.println("요청받은 주문이 없습니다.");
				}
				break;
			case "3":
				System.out.println("총 매출 : " + total);
				break;
			case "4":
				System.out.println("시스템을 종료합니다.");
				return;
			case "5":
				if (orders.size() == 0) {
					System.out.println("없습니다.");
					break;
				} else {
					int i = 1;
					for (Order o : orders)
						System.out.println((i++) + ". " + o);
				}
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}

		}
	}
}
