package kosta.sort;

import java.util.Comparator;

public class Descending implements Comparator<Integer> {

	@Override
	public int compare(Integer n1, Integer n2) {
		if(n1 > n2)   // -1 안바꿈 1 바굼
			return -1;
		else if(n1 < n2)
			return 1;
		
		return 0;
	}

}
