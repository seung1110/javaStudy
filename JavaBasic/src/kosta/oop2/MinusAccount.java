package kosta.oop2;

public class MinusAccount extends Account {
	// 마이너스 한도 금액
	int credit;
	
	public MinusAccount() {}

	public MinusAccount(String no, String name, int bal, int credit) {
		super(no, name, bal);
		this.credit = credit;
	}

	@Override
	public int withdraw(int amount) {
		if( super.getBalance() >= amount)
			return super.withdraw(amount);
		else {
			if(amount<= credit + super.getBalance()) {
				this.setBalance(super.getBalance()-amount);
				return amount;
			}
			else {
				return 0;
			}
		}
	}
	
	

}
