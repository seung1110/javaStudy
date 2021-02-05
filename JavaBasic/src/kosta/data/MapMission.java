package kosta.data;

import java.util.*;

public class MapMission {

	public static void main(String[] args) {
		// 이름, 점수 한 쌍으로 map, 시험응시자 출력(keySet)
		// 점수만 출력 values() reutrn collection
		// 총점, 평균, 최저 점수, 최고 점수
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("김자바", 70);
		map.put("홍길동", 62);
		map.put("둘리", 64);
		map.put("파이썬", 81);
		map.put("고", 71);
		map.put("러스트", 92);
		map.put("리액트", 55);
		map.put("노드js", 31);

		System.out.println(map.size());
		System.err.println(map.get("파이썬"));

		// 시험 응시자 출력
		for (String s : map.keySet()) // keySet() 메서드는 key 타입의 Set을 반환 (String Set)
			System.out.println(s);

		Iterator<Integer> iter = map.values().iterator(); // vales() 메서드는 value 타입의 Colletion을 반환 (Integer Collection)
															// Collection 인터페이스의 iterator() 메 서드는 Iterator 객체 반환
		int total = 0;
//		Iterator it = map.entrySet().iterator();
//		
//		while(it.hasNext()) {
//			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>)it.next();
//			total += e.getValue();
//		}

		while (iter.hasNext()) { // Iterator class의 메서드 hasNext() Iterator의 다음 객체가 있으면 true 없으면 false
			int num = iter.next(); // Iterator class의 메서드 next() Iterator의 다음 객체를 가져옴
			System.out.println(num);
			total += num;
		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + ((double) total / map.size()));
		System.out.println("최고 점수 : " + Collections.max(map.values())); // Collections class의 최대값 반환 메서드
		System.out.println("최저 점수 : " + Collections.min(map.values())); // Collections class의 최소값 반환 메서드

		Iterator iter1 = map.entrySet().iterator();

		while (iter1.hasNext()) { // iterator를 통해 출력
			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>) iter1.next(); // map 하나의 요소 Map.Entry
			System.out.println("key : " + e.getKey() + " Value : " + e.getValue());
		}
	}

}
