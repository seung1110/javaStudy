package kosta.oop2;

public class MinusMain {

	public static void main(String[] args) {
		MinusAccount ma = new MinusAccount("1", "홍길동", 1000, 500);
		System.out.println(ma.withdraw(2000));
		System.out.println(ma.withdraw(1000));
		System.out.println(ma.withdraw(1500));
		System.out.println(ma.withdraw(600));
		System.out.println(ma.withdraw(500));
		ma.accountInfo();
	}

}
