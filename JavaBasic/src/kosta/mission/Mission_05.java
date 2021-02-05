package kosta.mission;

import java.util.Scanner;

public class Mission_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer, num, trial = 0;
		Scanner sc = new Scanner(System.in);
		num = (int) (Math.random() * 100) + 1;
		System.out.println(num);

		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			answer = sc.nextInt();
			if (answer <= 100) {
				trial++;
				if (answer > num) {
					System.out.println("DOWN");
				} else if (answer < num) {
					System.out.println("UP");
				} else {
					System.out.println("정답입니다! 총 " + trial + "번 시도하였습니다.");
					break;
				}
			}
			else {
				System.out.println("100보다 작은 수를 입력해주세요.");
			}
		}


	}

}
