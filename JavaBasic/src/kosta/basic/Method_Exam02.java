package kosta.basic;

public class Method_Exam02 {

	public static void main(String[] args) {
		// 메서드 이용, 두 배열의 자리 수와 내용이 일치하는지 체크
		int num1[] = { 1, 2, 3, 4, 5 };
		int num2[] = { 1, 2, 3, 4, 6 };

		if (equals(num1, num2)) {
			System.out.println("서로 일치한다.");
		} else
			System.out.println("서로 불일치 한다.");
	}

	public static boolean equals(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}

		for (int i = 0; i < arr1.length; i++) 
			if (arr1[i] != arr2[i])
				return false;

		return true;
		

	}
}
