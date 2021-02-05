package kosta.oop;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle(sc.nextInt(),sc.nextInt());
		System.out.print("가로 길이 : ");
//		rec.width = sc.nextInt();
		System.out.print("세로 길이 : ");
//		rec.height = sc.nextInt();

		
		System.out.println(rec.area());
	}

}
