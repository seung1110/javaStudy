package kosta.basic;

public class If_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 20;
		
		if(a<b) {
			System.out.println("a보다 b가 크다");
			System.out.println("a가 크다");
		}
		else {
			System.out.println("b보다 a가 크다");
		}
		int n = 1;
		switch (n) {
		case 1:
			System.out.println("1이 출력");
			break;
		case 2:
			System.out.println("2이 출력");
			break;
		case 3:
			System.out.println("3이 출력");
			break;
		default:
			System.out.println("그 밖의 내용");
			break;
		}
	}

}
