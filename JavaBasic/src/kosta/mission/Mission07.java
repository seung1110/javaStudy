package kosta.mission;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		// 국영수, 총점, 평균 , 2명 이상 입력 받음
		// 출력 국어t 영어t 총점t 평균t
		String sub[] = { "국어", "영어", "수학" };
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][4];

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 성적");
			for (int j = 0; j < 3; j++) {
				System.out.print(sub[j] + " 성적 : ");
				arr[i][j] = sc.nextInt();
				arr[i][3] += arr[i][j];
			}
		}
		
		//총점이 높은 순으로 정렬
//		Arrays.sort(arr,new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				if( o1[3] > o2[3])
//					return -1;
//				else if ( o1[3] < o2[3])
//					return 1;
//				else
//					return 0;
//			}
//		});
		
		// 선택 정렬
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1; j < arr.length;j++) {
				int temp[];
				if(arr[i][3] < arr[j][3]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.print(arr[i][3]/3.0 + "\t");
			System.out.println();
		}
	}

}
