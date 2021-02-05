package kosta.basic;

public class CallByExam {

	public static void main(String[] args) {
		//call by value 
		int num = 50;
		change(num);
		System.out.println(num);
		
		//call by reference
		int arr[] = {10};
		change2(arr);
		System.out.println(arr[0]);
		
		String s = "hi";
		change3(s);
		System.out.println(s);
		
	}

	public static void change(int n) {
		n += 100;
	}
	public static void change2(int[] ar) {
		// parameter의 값으로 주소값이 들어옴
		ar[0] += 5;
	}
	public static void change3(String s) {
		s += "change";
	}
}
