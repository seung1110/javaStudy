package kosta.thread;

public class Account {
	private int balance;
	
	public Account() {	}
	public Account(int a) {
		this.balance = a;
	}
	public void withdraw(int a) {
		balance -= a;
	}
	
	public void deposit(int a) {
		balance += a;
	}
	
	public int getBalance() {
		return this.balance;
	}
}
