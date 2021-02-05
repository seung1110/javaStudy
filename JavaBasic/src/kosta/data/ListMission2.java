package kosta.data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListMission2 {

	public static void main(String[] args) {
		// 로또번호 1~45 출력
		// 1 배열로 구현
		int[] loto = new int[6];
		int[] ran = new int[45];
		for(int i = 0; i < 45; i++)
			ran[i] = i+1;
		
		for(int i = 0; i < 1000; i ++) {
			int temp = (int)(Math.random()*45);
			int temp1 = (int)(Math.random()*45);
			int temp2 = ran[temp];
			ran[temp]  = ran[temp1];
			ran[temp1] = temp2;
		}
		System.arraycopy(ran, 0, loto, 0, loto.length);
		Arrays.sort(loto);
		System.out.println("배열");
		for(int i : loto)
			System.out.print(i +"  ");
		
		// 2 list 구현 contains(정수) 포함되어 있는지 확인
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 6;) {
			int temp = (int)(Math.random()*45 + 1);
			if(!list.contains(temp)) {
				list.add(temp);
				i++;
			}			
		}
//		Collections.sort(list);
		list.sort(null);
//		for(int i : list)
//			System.out.print(i+ "  ");

		Iterator<Integer> i = list.iterator();
		System.out.println("\nArrayList");
		while(i.hasNext())
			System.out.print(i.next() + "  ");
		
		
		
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size() <7) {
			set.add((int)(Math.random()*45+1));
		}
		
		TreeSet<Integer> ts = new TreeSet<Integer>();  // set 정렬을 위해 treeste 생성
		ts.addAll(set);   // treeset에 set의 내용 전부 추가
		
		i = ts.iterator();
		System.out.println("\nSet");
		while(i.hasNext())
			System.out.print(i.next()+"  ");
		
		
		LinkedList<Integer> llist = new LinkedList<Integer>();
		
	}
}
