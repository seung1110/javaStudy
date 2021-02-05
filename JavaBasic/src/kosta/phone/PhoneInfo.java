package kosta.phone;

import java.io.Serializable;

public class PhoneInfo implements Serializable{
//멤버 변수, 메서드 선언 및 정의
	private String name, phoneNum,birth;
	
	public PhoneInfo() {}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public PhoneInfo(String name, String phoneNum, String birth) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}


	public void printInfo() {
		System.out.println(name + "\t" + phoneNum + "\t" + birth);
	}
	}
