package kosta.oop;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board boards[] = new Board[2];
		int num = 1;

		for (int i = 0; i < 2; i++) {
			System.out.print("글 제목 : ");
			String title = sc.nextLine();
			
			System.out.print("작성자 : ");
			String writer = sc.nextLine();
			
			System.out.print("글 내용 : ");
			String sen[] = new String[1];
			sen[0] = sc.nextLine();
			boards[i] = new Board(num++, title, writer, sen);
			boards[i].print();
		}
	}

}
