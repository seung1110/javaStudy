package kosta.data;

import java.util.*;

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();

		m.put("1", "NC");
		m.put("2", "두산");
		m.put("3", "KT");

		System.out.println("사이즈 : " + m.size()); // 사이즈 : 3 출력

		if (m.containsValue("두산")) {
			m.remove("2");   // key가 2인 요소 삭제
		}

		System.out.println("사이즈 : " + m.size()); // 사이즈 : 3 출력

		System.out.println(m.get("1"));  // NC   출력
		
		// Map 출력      map => set => iterator
		// Map.entrySet() 은 해당 Map을 Set으로 리턴
		Iterator iter = m.entrySet().iterator();
		
		while(iter.hasNext()) {  // iterator를 통해 출력
			Map.Entry<String, String> e = (Map.Entry<String, String>)iter.next();   // map 하나의 요소 Map.Entry
			System.out.println("key : " + e.getKey() + " Value : " + e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
