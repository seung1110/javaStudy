package kosta.basic;

import java.util.Scanner;

public class Loop_Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while 수직방향구조
		// for 수평방향구조
//		int sum = 0;
//		int i = 1;
//		while(i <= 10) {
//			sum += i++;
//		}
//		System.out.println("1에서 10까지의 합 : " + sum);
//		
//		 i = 0;
//		 sum = 0;
//		 while(i < 10) {
//			 sum += ++i;
//		 }
//		 System.out.println("1에서 10까지의 합 : " + sum);

//		int i = 1;
//		while(i < 10) {
//			System.out.println("7 * " + i +" = "+(7*i));
//			i++;
//		}
//	
//		for(int i = 1; i <= 9; i++)
//			System.out.println("7 * "+i+" = "+ 7*i);

		// 1~100사이 2의 배수 및 3의 배수가 아닌 숫자만 출력
//		for(int i = 1; i <= 100; i++) {
//			if(i%2 != 0 && i%3 !=0)
//				System.out.println(i);
//		}
//		

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0)
				continue;
			System.out.println(i);
		}

		// 숫자입력 받아서 합
		// 음수를 입력 받으면 새롭게 다시 입력 받도록 하자.
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int user = 0;

//		do {
//			System.out.println("숫자를 입력하세요");
//			user = sc.nextInt();
//		}while(user < 0);

//		while(true) {
//			System.out.println("숫자를 입력하세요");
//			user = sc.nextInt();
//			if(user > 0)
//				break;
//		}

//		while(user <= 0) {
//			System.out.println("숫자를 입력하세요");
//			user = sc.nextInt();
//		}
//		
//		for(; user <= 0;) {
//			System.out.println("숫자를 입력하세요");
//			user = sc.nextInt();
//		}
//		
//		for(int i = 1; i <= user; i++)
//			sum += i;
//		System.out.println("숫자의 합 : " + sum);

		// 2개의 정수를 입력 받아 b - a 결과 출력하자.
		// 항상 b>a 여야 한다. 아닐 경우 다시 입력 받음
		// 1. do while문을 통해 입력 받음
		// 2. while문 무한 반복
//		int a, b;

//		do {
//			System.out.print("숫자를 입력하세요 : ");
//			a = sc.nextInt();
//			System.out.print("숫자를 입력하세요 : ");
//			b = sc.nextInt();
//		} while (b < a);
//		System.out.println(b + " - " + a + " = " + (b - a));

//		while (true) {
//			System.out.print("숫자를 입력하세요 : ");
//			a = sc.nextInt();
//			System.out.print("숫자를 입력하세요 : ");
//			b = sc.nextInt();
//			if (b > a) {
//				System.out.println(b + " - " + a + " = " + (b - a));
//				break;
//			}
//		}
//
//		while (true) {
//			System.out.print("숫자를 입력하세요 : ");
//			String answer = sc.nextLine();
//			String an[] = answer.split(" ");
//			a = Integer.parseInt(an[0]);
//			b = Integer.parseInt(an[1]);
//
//			if (b > a) {
//				System.out.println(b + " - " + a + " = " + (b - a));
//				break;
//			}

//		}
	}

}
