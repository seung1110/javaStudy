package kosta.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];  // 배열 선언 => 주소값을 넣을 수 있는 변수 생성
		a = new int[3]; // 배열 생성, 생성된 주소를 a에 대입
		
		int arr[] = new int[5];
		
		int arr2[] = {1,2,3,4,5};
		
//		for(int i = 0; i < arr2.length; i++)
//			System.out.println("arr2[" + i + "]= " + arr2[i]);
//		// 향상된 for문
//		for(int i : arr2) 
//			System.out.println(i);
		
		// 배열에 사용될 데이터 타입은? => 배열의 크기를 결정 => 배열 초기화 
		
//		int arr0[] = new int[9];
//		for(int i = 0; i < 9; i ++) {
//			arr0[i] = 7 * (i+1);
//			System.out.println("7 * " + (i+1) + " = " + arr0[i]);
//		}
		String input[] = new String[100];
		Scanner sc = new Scanner(System.in);
		String temp = "a";
		int i = 0;
		
		while(true) {
			System.out.print("문자를 입력하세요 : ");
			temp = sc.nextLine();
			if(temp.equals("q")) break;
			input[i++] = temp;
		}
		for(String s : input) {
				if(s == null) break;
				else	
					System.out.println(s);
		}
	}
	

}
