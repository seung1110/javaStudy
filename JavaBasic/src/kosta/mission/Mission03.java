package kosta.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		// 임의의 정수 값에 대해서 전체 자리 수 중 짝수, 홀수의 개수를 구하자.
		// 5자리 ex) 56872 
		// 짝수의 수 : 3개 홀수의 수 : 2개
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int evenNum=0;
		int oddNum=0;
		for(int i = 0; i < 5; i++) {
			int temp = (input/Math.pow(10,i))%2 <1 ? evenNum++ : oddNum++;
		}
		int a = 1, b = 2;
		

		System.out.println("짝수의 수 : "+evenNum+" 홀수의 수 :"+oddNum);
		
	}

}
