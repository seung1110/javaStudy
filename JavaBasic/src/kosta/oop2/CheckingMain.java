package kosta.oop2;

public class CheckingMain {

	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount("222-222", "홍길동", 3000, "222-222");

		try {
			ca.pay("222-222", 1500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			ca.accountInfo();
		}

	}

}
