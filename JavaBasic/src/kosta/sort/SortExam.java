package kosta.sort;

import java.util.Comparator;
import java.util.TreeSet;

public class SortExam {

	public static void main(String[] args) {
		//정렬 기준 : Comparable => compareTo() 오버라이드
		// 정렬 기준 변경 : Comparator => compare()  오버라이드
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		TreeSet<Integer> dset = new TreeSet<Integer>(new Descending());
		
		TreeSet<Integer> dset1 = new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 > o2)
					return -1;
				else if(o1 < o2)
					return 1;
				return 0;
			}
		});
		
		while(tset.size() < 6) {
			tset.add((int)(Math.random()*45+1));
		}
		while(dset.size() < 6) {
			dset.add((int)(Math.random()*45+1));
		}
		
		while(dset1.size() < 6) {
			dset1.add((int)(Math.random()*45+1));
		}
		for(int i : tset)
			System.out.print(i + "  ");
		
		System.out.println();
		
		for(int i : dset)
			System.out.print(i + "  ");

		System.out.println();
		
		for(int i : dset1)
			System.out.print(i + "  ");

	}

}
