package kosta.basic;

import java.util.Arrays;

public class ArrayExam02 {

	public static void main(String[] args) {
		int[] arrT1 = {1,2,3};
		int[] arrT2 = {1,2,3};
System.out.println(Arrays.equals(arrT1,arrT2));
		// 행과 열 사이즈 지정 생성
		int[][] a = new int[5][4];

		// 행별로 열 사이즈가 다르게 생성
		int[][] a1 = new int[3][];
		a1[0] = new int[2];
		a1[1] = new int[3];
		a1[2] = new int[4];

		// 생성과 동시에 초기화
		int[][] a2 = { { 0, 1 }, { 1, 2, 3, }, { 2, 3, 4, 5 } };

		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a2[i].length; j++)
				System.out.print(a2[i][j] + " ");
			System.out.println();
		}

		// 배열 복사
//		String oldArr[] = new String[3];
//		oldArr[0] = "10";
//		oldArr[1] = "20";
//		int arr[] = new int[5];
		int arr[] = {1,2,3};
		int copy1[] = Arrays.copyOf(arr, arr.length);
		int copy2[] = Arrays.copyOf(arr, 1);
		int copy3[] = Arrays.copyOfRange(arr, 1,3);
		System.out.println(Arrays.toString(copy3));
		
		int oldArr1[] = {3,4,5};
		int newArr1[] = new int[5];
		newArr1[0] = 1;
		newArr1[1] = 2;
		System.arraycopy(oldArr1, 0, newArr1, 2, oldArr1.length);
		System.out.println(Arrays.toString(newArr1));

//
//		String newArr[] = new String[2];
		
		//                  원본배열, 시작점, 복사할 배열 , 저장 시작점, 복사 내용 길이
//		System.arraycopy(oldArr, 0, newArr, 0,newArr.length);
//		System.out.println(Arrays.toString(newArr));

	}

}
