package kosta.basic;

public class VariableTest {

	public static void main(String[] args) {

		//적절한 데이터 타입 삽입
		double n1 = 11.4 + 10;
		System.out.println(n1);

		double n2 = 10 + 11.4;
		System.out.println(n2);

		int n3 = (int)n2;
		System.out.println(n3);
		
		String n4 =n3 + "";
		System.out.println(n4);

		int n5 = Integer.parseInt(n4);
		System.out.println(n5);
		
		String s = "3";
		double d = Double.parseDouble(s);
		System.out.println(d);
		
		int a = 20, b = 30;
		int max = a < b ? b : a;

	}

}
