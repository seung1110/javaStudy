package kosta.mission;

import java.util.Scanner;

public class Mission02 {
	
	public static void main(String[] args) {
		// 국,영,수 점수 총점과 평균
		Scanner sc = new Scanner(System.in);
		int kor,eng,math;
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
		
		System.out.println("총점 : "+ sum(kor,eng,math));
		System.out.printf("평균 : %.3f\n", avg(sum(kor,eng,math)));
		
//		if(avg >= 90) {
//			System.out.println("A학점입니다.");
//		}
//		else if (avg >= 80) {
//			System.out.println("B학점입니다.");
//
//		}
//		else if (avg >= 70) {
//			System.out.println("C학점입니다.");
//		}
//		else if (avg >= 60) {
//			System.out.println("D학점입니다.");
//		}
//		else{
//			System.out.println("F학점입니다.");
//		}
		final int n = 10;
		switch ((int)avg(sum(kor,eng,math))/10) {
		case n:
			System.out.println("만점입니다.");
			break;
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		case 6:
			System.out.println("D학점입니다.");
			break;
		default:
			System.out.println("F학점입니다.");
			break;
		}
		
	}
	
	public static int sum(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
	public static double avg(int n) {
		return n/3.0;
	}
}
