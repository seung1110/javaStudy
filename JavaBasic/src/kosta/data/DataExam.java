package kosta.data;

import java.util.ArrayList;

public class DataExam {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println(list.isEmpty());  // true 출력
		System.out.println(list.size());  // 0 출력
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println(list.isEmpty());  // false 출력
		System.out.println(list.size());  // 4 출력
		
		for(String s : list)
			System.out.print(s + " ");   // a b c d 출력
		
		System.out.println("\n삭제된 것 : " + list.remove(1)); // 삭제되는게 출력
		System.out.println(list.remove("d"));  // 삭제 성공 true 실패 false (list 안에 해당 객체가 없을 때)
		
		for(String s : list)
			System.out.print(s + " ");   // a c 출력
		
		list.add(1,"new");  // 1번 인덱스에 new 추가
		
		System.out.println();
		for(String s : list)
			System.out.print(s + " ");  //  a new c 출력
		
	}

}
