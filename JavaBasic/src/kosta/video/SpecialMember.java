package kosta.video;

public class SpecialMember extends GeneralMember {
	private int bonus;
	
	public SpecialMember(String id, String name, String address, int bonus) {
		super(id, name,address);
		this.bonus = bonus;
	}
	
	public void pirntMember2() {
		super.printMember();
		System.out.println("회원의 보너스 포인트 적립 : " + this.bonus);
	}
	
	@Override
	public void printMember(){
		super.printMember();
		System.out.println("회원의 보너스 포인트 적립 : " + this.bonus);
		System.out.println();
	}
	
}
