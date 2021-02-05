package kosta.mission;

import java.util.Scanner;

public class Mission02_1 {

	public static void main(String[] args) {
//		// 국영수 성적 입력 받아 총점, 평균 출력 , 모든 변수는 배열에 저장
		int score[] = new int[4];
		input(score);
		printScore(score);
		
//		System.out.println("국어\t영어\t수학\t총점\t평균");
//		for (int i = 0; i < sub.length; i++)
//			System.out.print(score[i] + "\t");
//		System.out.printf("%d\t%.2f", score[3], score[3] / 3.0);

		// 최대값 최소값
//		int score[] = {4, 12, 74, 3 , 1, 99};
//		int max = 0,min = 100;
//		for(int i : score) {
//			if(max < i)
//				max = i;
//			if(min > i)
//				min = i;
//		}
//		System.out.println(max + " " + min);
		// 셔플
//		int num[] = {1,2,3,4,5,6,7,8,9};
//		for(int i = 0; i < 100; i++) {
//			int temp = num[0];
//			int ran = (int)(Math.random()*9);
//			num[0] = num[ran];
//			num[ran] = temp;
//		}
//		
//		for(int i : num)
//			System.out.print(i+" ");
		// 로또
//		int num[] = new int[45];
//		for (int i = 0; i < num.length; i++)
//			num[i] = i + 1;
//		for (int i = 0; i < 1000; i++) {
//			int temp = num[0];
//			int r = (int) (Math.random() * 45);
//			num[0] = num[r];
//			num[r] = temp;
//		}
//		int lotto[] = new int[6];
//		for (int i = 0; i < 6; i++)
//			lotto[i] = num[i];
//
//		lotto = mergeSort(lotto);
//		System.out.println("추천 번호");
//		for (int i = 0; i < 6; i++)
//			System.out.print(lotto[i] + "\t");

	}

//	static int[] mergeSort(int[] arr) {
//		int[] temp = arr;
//		int[] arrL, arrR;
//
//		if (arr.length > 1) {
//			arrL = new int[(int) (arr.length / 2)];
//			arrR = new int[arr.length - arrL.length];
//
//			for (int i = 0; i < arr.length; i++) {
//				if (i < arrL.length)
//					arrL[i] = arr[i];
//				else
//					arrR[i - arrL.length] = arr[i];
//			}
//
//			arrL = mergeSort(arrL);
//			arrR = mergeSort(arrR);
//			temp = merge(arrL, arrR);
//		}
//
//		return temp;
//	}
//
//	static int[] merge(int[] arr1, int[] arr2) {
//		int[] temp = new int[arr1.length + arr2.length];
//		int i = 0, j = 0, count = 0;
//
//		while (i < arr1.length && j < arr2.length) {
//			if (arr1[i] > arr2[j]) {
//				temp[count++] = arr2[j++];
//			} else {
//				temp[count++] = arr1[i++];
//			}
//		}
//
//		if (i == arr1.length) {
//			for (; j < arr2.length; j++)
//				temp[count++] = arr2[j];
//		} else if (j == arr2.length) {
//			for (; i < arr1.length; i++)
//				temp[count++] = arr1[i];
//		}
//
//		return temp;
//	}
	static void total(int[]arr) {
		for(int i =0; i < 3; i++)
			arr[3] += arr[i];
	}
	
	static double avg(int a) {
		return a/3.0;
	}
	
	static void printScore(int[] arr) {
		System.out.println("국어\t영어\t수학\t총점\t평균");
		total(arr);
		System.out.printf("%d\t%d\t%d\t%d\t%.2f",arr[0],arr[1],arr[2],arr[3],avg(arr[3]));
	}
	
	static void input(int[]arr) {
		String sub[] = { "국어", "영어", "수학" };
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i] + " 점수를 입력하세요 : ");
			arr[i] = sc.nextInt();
		}
	}
	

}
