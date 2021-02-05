package kosta.oop;

public class Account {
	// 공통된 데이터 구조 (속성 => 멤버 변수)
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {}
	public Account(String no, String name, int bal) { // 매개변수
		accountNo = no;
		ownerName = name;
		balance = bal;
	}

	// 입금, 출금, 계좌 정보 출력
	public void deposit(int amount) {
		balance += amount;
	}
	
	public int withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			return amount;
		}
		else {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
	}
	
	public void accountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("계좌주 : " + ownerName);
		System.out.println("잔액 : " + balance);
		System.out.println();
	}
	
}
