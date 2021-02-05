package kosta.basic;

import java.util.Random;

public class Random_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//math class
		int d = (int)(Math.random()*45)+1;
		System.out.println(d);
		
		//random class
		Random r = new Random();
		int d2 = r.nextInt(6)+1;
		System.out.println(d2);
	}

}
