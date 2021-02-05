package kosta.oop;

import java.util.Arrays;

public class Board {
	//여러 개의 글 입력 받고 출력하는 프로그램 구현(생성자 구현)
	// 글 번호, 제목, 작성자, 내용
	// 글쓰기, 전체 글 출력
	int num;
	String title,name,str[];
	public Board(){}
	
	public Board(int num, String title, String name, String str[]) {
		this.num = num;
		this.title = title;
		this.name = name;
		this.str = str;
	}

	public void write(String str) {	
		String[] temp = new String[this.str.length+1];
		System.arraycopy(this.str, 0, temp, 0, this.str.length);
		temp[temp.length-1] = str; 
		this.str = temp;
	}
	public void print() {
		System.out.println("No." + this.num +" 제목 : "+ this.title + " 작성자 : "+this.name);
		System.out.println("#### 내용 ####");
		for(int i = 0; i < this.str.length; i++)
			System.out.println(str[i]);
	}
}
