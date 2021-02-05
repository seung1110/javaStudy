package kosta.algo;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		int num = sc.nextInt();	
//		int input[][] = new int [num][2];
//		sc.nextLine();
//		String s[] = new String[num];
		
		
//		for(int i = 0; i < num; i ++) {
////			s[i] = sc.nextLine();
//			input[i][0] = sc.nextInt();
//			input[i][1] = sc.nextInt();
//		}
		for(int i = 0; i < num; i ++) {
//			String temp[] = s[i].split(" ");
//			int n1 = Integer.parseInt(temp[0]);
//			int n2 = Integer.parseInt(temp[1]);
//			System.out.println("#"+(i+1)+" "+sol(n1,n2));
//			System.out.println("#"+(i+1)+" "+sol(input[i][0],input[i][1]));
//			System.out.println("rec#"+(i+1)+" "+recurSol(input[i][0],input[i][1]));
			sb.append("#"+(i+1)+" "+recurSol(sc.nextInt(),sc.nextInt())+"\n");
		}
			System.out.println(sb);
	}
	
	static int sol(int n1,int n2) {
		int count = 0;
		while( n1 >= n2) {
			n1 *= 2;
			n2 *= 3;
			count++;
		}
		return count;
	}
	
	static int recurSol(int n1, int n2) {
		if(n1 >= n2) {
			return 1 + recurSol(n1*2,n2*3);
		}
		return 0;
	}
}
