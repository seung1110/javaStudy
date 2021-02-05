package kosta.oop2;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount() {	} // 생성자는 상속안됨
					                       // parent가 먼저 생성됨.(parent의 default constructor 호출)
	public CheckingAccount(String no, String name, int bal, String cardNo) {
		super(no,name,bal); // super를 통해 부모 클래스의 다른 생성자 사용 가능
		this.cardNo = cardNo;
	}
	public int pay(String cardNo, int amount) throws Exception {
		if(super.getBalance()>= amount && this.cardNo.equals(cardNo)) {
			return super.withdraw(amount);
		}
		else
			throw new Exception("결제 불가");
	}
	
	
	public String getCardNo() {
		return cardNo;
	}
	
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

}

