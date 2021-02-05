package kosta.algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Game {
	private Scanner sc = new Scanner(System.in);
	int[] sol;

	public Game() {
		this.sol = make_sol();
		System.out.println(sol[0] + "" + sol[1]+sol[2]);
//		this.sol = make_sol2();
//		this.sol = make_sol3();
		playGame();
	}

	public void playGame() {
		int count = 0;
		int bo[] = new int[2]; // 0 idx가 strike
		System.out.println("게임 시작");
		do {
			int[] ans = input_num();
			bo = check(this.sol, ans);
			System.out.println("Strike : " + bo[0] + " Ball : " + bo[1]);
			count++;
			System.out.println();
		} while (bo[0] != 3);

		System.out.println("정답을 맞추기위해 " + count + "번 도전하였습니다.");

	}

	public int[] make_sol() {
		int[] ans = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] temp = new int[3];

		for (int i = 0; i < 1000; i++) {
			int ran1 = (int) (Math.random() * 9);
			int ran2 = (int) (Math.random() * 9);

			int num = ans[ran1];
			ans[ran1] = ans[ran2];
			ans[ran2] = num;
		}

		System.arraycopy(ans, 0, temp, 0, 3);
		return temp;

	}

	public int[] make_sol2() {
		int[] temp = new int[3];
		for (int i = 0; i < 3; i++) {
			temp[i] = (int) (Math.random() * 9 + 1);
			for (int j = 0; j < 3; j++) {
				if (i != j && temp[i] == temp[j]) {
					i--;
					break;
				}
			}
		}
		return temp;
	}

	public int[] make_sol3() {
		int[] temp = new int[3];
		temp[0] = (int) (Math.random() * 9 + 1);
		do {
			temp[1] = (int) (Math.random() * 9 + 1);
		} while (temp[0] == temp[1]);
		do {
			temp[2] = (int) (Math.random() * 9 + 1);
		} while (temp[0] == temp[2] || temp[1] == temp[2]);
		
		return temp;
	}


	public int[] input_num() {
		System.out.print("숫자를 입력하세요 : ");
//		String ans = sc.nextLine(); string으로 처리
		int[] an = new int[3];
		for (int i = 0; i < 3; i++)
			an[i] = sc.nextInt();
//			an[i] = Integer.parseInt(ans.substring(i, i + 1)); string으로 처리
		sc.nextLine();
		return an;
	}

	public int[] check(int[] sol, int[] an) {
		int[] che = new int[2];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (sol[i] == an[j]) {
					if (i == j) {
						che[0]++;
						break;
					} else {
						che[1]++;
						break;
					}
				}
			}
		}
		return che;
	}
	
	public int[] check2(int[] sol, int[] an) {
		int[] che = new int[2];
		
		for (int i = 0; i < 3; i++) {
			if(sol[i] == an[(i+1)%3] || sol[i] == an[(i+2)%3])
				che[1]++;
			else if (sol[i] == an[i])
				che[0]++;
		}
		return che;
	}
	
	
}
