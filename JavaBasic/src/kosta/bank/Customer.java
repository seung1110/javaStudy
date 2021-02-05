package kosta.bank;

public class Customer {
	private String id;
	private String name;
	private Account account;
	
	public Customer() {}
	
	public Customer(String id, String name, long balance) {
		super();
		this.id = id;
		this.name = name;
		this.account = new Account (this.id, balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getId() {
		return id;
	}
	

}
