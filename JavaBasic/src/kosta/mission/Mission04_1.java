package kosta.mission;

import java.util.Scanner;

public class Mission04_1 {
	private static String ID = "kosta";
	static String PASS = "1004";

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int re;
		String id,pass;
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		id = sc.nextLine();
		System.out.print("비밀번호 : ");
		pass = sc.nextLine();
		
		re = login(id, pass);
		if(re == 1) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	
	}
	
	public static int login(String id, String pass) {
		if( id.equals(ID) && pass.equals(PASS))
			return 1;
		else
			return 0;
	}

}
