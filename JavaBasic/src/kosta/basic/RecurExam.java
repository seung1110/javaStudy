package kosta.basic;

import java.util.Scanner;

public class RecurExam {

	public static void main(String[] args) {
		
		// 재귀함수
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num + "! = " +fac(num));
	}

	private static int fac(int i) {
			if (i == 0)
				return 1;
		return fac(i-1) * i;
	}
}
