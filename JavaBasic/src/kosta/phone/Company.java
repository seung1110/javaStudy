package kosta.phone;

public class Company extends PhoneInfo {
	private String dept;
	private String position;
	
	public Company(){}
	
	public Company(String name, String phoneNum, String birth, String dept, String position) {
		super(name, phoneNum, birth);
		this.dept = dept;
		this.position = position;
	}

	@Override
	public void printInfo() {
		System.out.println(super.getName()+ "\t" +super.getPhoneNum() +"\t" + super.getBirth() +"\t"+this.dept +"\t"+this.position );
	}
	
	
}
