package kosta.thread;

public class SharedArea {
	Account a1 = new Account(20000000);
	Account a2 = new Account(10000000);
	
	synchronized void transfer(int amount) {
		a1.withdraw(amount);
		System.out.println("a1 계좌 " + amount + "원 인출");
		a2.deposit(amount);
		System.out.println("a2 계좌 " + amount + "원 입금");
		
	}
	synchronized void getTotal() {
		System.out.println("잔액 : " + (a1.getBalance() + a2.getBalance()));
	}
//	 void transfer(int amount) {
//		a1.withdraw(amount);
//		System.out.println("a1 계좌 " + amount + "원 인출");
//		a2.deposit(amount);
//		System.out.println("a2 계좌 " + amount + "원 입금");
//		
//	}
//	 void getTotal() {
//		System.out.println("잔액 : " + (a1.getBalance() + a2.getBalance()));
//	}
}
