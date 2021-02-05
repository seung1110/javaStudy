package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 추가  2. 삭제  3. 종료");
			String an = sc.nextLine();
			switch (an) {
			case "1":
				System.out.print("추가할 내용을 입력하세요 : ");
				list.add(sc.nextLine());
				show1(list);
				break;
			case "2":
				System.out.print("삭제할 내용을 입력하세요 : ");
				String temp = sc.nextLine();
				if(list.indexOf(temp) == -1) {
					System.out.println("존재하지 않는 문자열입니다.");
					break;
				}
				else {
					System.out.println("삭제한 내용 : " + list.remove(list.indexOf(temp)));
					show(list);
				break;
				}
			case "3":
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
			
		}
	}

	public static void show(List<String> list) {
		for(String s : list)
			System.out.print(s + "    ");
		System.out.println();
	}
	public static void show1(List<String> list) {
		Iterator<String> i = list.iterator();
		while(i.hasNext())
			System.out.print(i.next() + " ,");
		System.out.println();
	}
}
