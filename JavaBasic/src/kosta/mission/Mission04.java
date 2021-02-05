package kosta.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String uid = "kosta", upassword = "1234";
		System.out.print("아이디를 입력하여주세요 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호를 입력하여주세요 : ");
		String password = sc.nextLine();
		
		if(id.equals(uid) && password.equals(upassword)) {
			System.out.println("로그인 성공");
		}
		else {
			if(!id.equals(uid))
				System.out.println("해당 아이디가 존재하지 않습니다.");
			else{
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
	}

}
