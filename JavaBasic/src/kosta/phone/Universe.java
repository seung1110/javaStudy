package kosta.phone;

public class Universe extends PhoneInfo {
	private String major;
	private String year;
	public Universe() {}

	public Universe(String name, String phoneNum, String birth, String major, String year) {
		super(name, phoneNum, birth);
		this.major = major;
		this.year = year;
	}
	

	
	@Override
	public void printInfo() {
		System.out.println(super.getName()+ "\t" +super.getPhoneNum() +"\t" + super.getBirth() +"\t"+this.major +"\t"+this.year);
	}
}
