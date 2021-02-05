package kosta.basic;

public class Method_Exam {

	public static void main(String[] args) {

//		printChar('*', 4); // method call
		System.out.println(add(5,3));
	}

	// 접근제어자 반환형 메서드이름(파라미터) { 수행할 내용 }
	static void printChar(char a, int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a);
		System.out.println();
	}
	
	static int add(int n1, int n2) {
		return n1+n2;
	}
}
