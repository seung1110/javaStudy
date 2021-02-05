package kosta.mission;

public class ForExam {

	public static void main(String[] args) {
		method1_10(5);

	}

	static void method1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print((i * 5 + j + 1) + "\t");
			System.out.println();
		}
	}

	static void method2(int n) {
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++)
				System.out.print((i * 5 + j + 1) + "\t");
			System.out.println();
		}
	}

	static void method3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print((i * 10 + j * 2 + 1) + "\t");
			System.out.println();
		}
	}

	static void method4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print((j + 1) + "\t");
			System.out.println();
		}
	}

	static void method5(int n) {
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print((num++) + "\t");
			System.out.println();
		}
	}

	static void method6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.print((j + 1) + "\t");
			System.out.println();
		}
	}

	static void method7(int n) {
		int temp = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.print((temp++) + "\t");
			System.out.println();
		}
	}

	static void method2_1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	static void method2_2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	static void method2_3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (n - 1 - i <= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void method2_4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if ((n - 1) - i <= j && j <= (n - 1) + i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void method2_5(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if (i < n) {
					if ((n - 1) - i <= j && j <= (n - 1) + i)
						System.out.print("*");
					else
						System.out.print(" ");
				} else {
					if (i - n + 1 <= j && j <= 3 * n - (i + 3))
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void method2_6(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < 4 * n - 2; j++) {
				if (i < n) {
					if ((n - 1) - i <= j % 9 && j % 9 <= (n - 1) + i)
						System.out.print("*");
					else
						System.out.print(" ");
				} else {
					if (i - n + 1 <= j % 9 && j % 9 <= 3 * n - (i + 3))
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void method2_7(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 35; j++) {
				if (((n - 1) - i <= j && j <= (n - 1) + i) || ((14 - i - 1) <= j) && (j <= 22 + i - 1))
					System.out.print("*");
				else if (30 - i <= j && j <= 30 + i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void method2_8(int n) {
		for (int i = 0; i < 2 * n; i++) {
			for (int j = 0; j < 35; j++) {
				if (i >= n) {
					if ((9 - i <= j && j <= i - 1) || ((18 - i) <= j) && (j <= 18 + i))
						System.out.print("*");
					else if (37 - i <= j && j <= 27 + i)
						System.out.print("*");
					else
						System.out.print(" ");
				} else {
					if (19 - i <= j && j <= 19 + i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void method2_9(int n) {
		for (int i = 0; i <= n + 1; i++) {
			for (int j = 0; j <= n + 1; j++) {
				if (i % (n + 1) == 0 || j % (n + 1) == 0) {
					System.out.print("$");
				} else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	static void method2_10(int n) {
		for (int i = 0; i < n * 2 + 3; i++) {
			if (i < n + 2) {
				for (int j = 0; j < i + 1; j++) {
					if (i % (n * 2 + 3) <= 1 || j % i == 0) {
						System.out.print("@");
					} else
						System.out.print("*");
				}
			} else {
				for(int j = 0;  j < (n*2+3)-i; j++)
				if (i % (n * 2 + 2) <= 1 || j % ((n*2) +2 - i) == 0) {
					System.out.print("@");
				} else
					System.out.print("*");
			}
			System.out.println();
		}

	}
	static void method1_8(int n) {
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n; j++)
					System.out.print(i+1+j);
			System.out.println();
		}
	}
	static void method1_9(int n) {
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n; j++) {
				int num = i+j + 1;
				if(num % 5 == 0)
					System.out.print(5);
				else
					System.out.print(num%5);
			}
			System.out.println();
		}
	}
	static void method1_10(int n) {
		int num = 1;
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n; j++) {
				if(j >= n-1-i)
					System.out.print((num++) +"\t");
				else
					System.out.print(" "+"\t");
			}
			System.out.println();
		}
	}

}
