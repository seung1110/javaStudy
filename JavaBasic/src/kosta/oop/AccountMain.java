package kosta.oop;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
//		Account account1;  // 참조형 변수 선언(새로 생성된 객체의 주소를 보관하기 위한 변수)
//		account1 = new Account();  // 새로운 객체 생성(메모리 할당, 인스턴스화) => account1 변수 : 주소값을 가진다.(인스턴스 변수 : 객체)
//		
//		// 객체 초기화
//		account1.accountNo = "1111-1111";
//		account1.balance = 10000;
//		account1.ownerName = "홍길동";
		
//		account1.deposit(5000);
//		account1.accountInfo();
		// 인출 금액, 잔액 출력
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("출금할 금액을 입력해주세요 : ");
//			int res = sc.nextInt();
//			res = account1.withdraw(res);
//			if(res != 0) {
//				System.out.println("인출 금액 : " + res);
//				System.out.println("잔액 : " + account1.balance);
//				break; 
//			}
//		}
		Account accounts[] = {new Account("1111-1111","홍길동",10000), new Account("1234-1234","고길동",67000)};
		for(int i = 0; i  < accounts.length;i++)
			accounts[i].accountInfo();
	}

}
