package kosta.bank;

public class Account {
	private String id;
	private long balance;

	public Account() {}

	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public boolean withdraw(long amt) {
		if(this.balance >= amt) {
			this.balance -= amt;
			return true;
		}
		
		return false;
	}

	public String getId() {
		return id;
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(long amt) {
		this.balance += amt;
	}	
	
}
