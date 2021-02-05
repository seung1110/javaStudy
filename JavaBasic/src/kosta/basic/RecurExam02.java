package kosta.basic;

import java.util.Arrays;
import java.util.Scanner;

public class RecurExam02 {

	public static void main(String[] args) {
		// 0 ~ n 합 재귀로
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
////		System.out.println(sum(num));
//		
//		// 입력 받은 n의 인덱스부터 합
//		int arr[] = {10,20,30,40};
//		System.out.println(sumArray(arr,num));
		
		int arr[] = {32,10,5,129,50,2};
		arr = mergeSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
	}

	static int sum(int i) {
		if (i == 0)
			return 0;
		return sum(i - 1) + i;
	}
	
	static int sumArray(int[] arr, int n) {
		if(n > arr.length)
			return 0;
		if(n==0)
			return arr[n];
		return sumArray(arr, n-1)+ arr[n];
	}
	
	static int[] mergeSort(int[]arr) {
		
		if( arr.length >= 2) {
			int [] arrL = Arrays.copyOfRange(arr, 0, (int)(arr.length/2));
			int [] arrR = Arrays.copyOfRange(arr, arrL.length, arr.length);
			arrL = mergeSort(arrL);
			arrR = mergeSort(arrR);
			arr = merge(arrL,arrR);
			return arr;
		}
		else
			return arr;
		
		
	}

	public static int[] merge(int[] arrL, int[] arrR) {
		int[] temp = new int[arrL.length + arrR.length];
		int l =0, r =0,count = 0;
		while( l < arrL.length && r < arrR.length) {
			if(arrL[l] > arrR[r])
				temp[count++] = arrR[r++];
			else
				temp[count++] = arrL[l++];
		}
		
		if(l < arrL.length)
			System.arraycopy(arrL, l, temp, count, arrL.length - l);
		else
			System.arraycopy(arrR, r, temp, count, arrR.length - r);
		return temp;
	}
}
