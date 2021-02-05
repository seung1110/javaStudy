package kosta.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("김자바",75));
		list.add(new Person("이자바",23));
		list.add(new Person("박자바",26));
		list.add(new Person("최자바",34));
		list.add(new Person("태자바",56));
		list.add(new Person("장자바",17));
		list.add(new Person("구자바",71));
		
		list.sort(null);
//		Collections.sort(list);
		for(Person p : list)
			System.out.println(p);
		
		list.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// 이름 기준 내림차순
				return -(o1.getName().compareTo(o2.getName()));
			}
		});
		System.out.println();
		for(Person p : list)
			System.out.println(p);
	}

}
