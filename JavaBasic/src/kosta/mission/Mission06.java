package kosta.mission;

import java.util.Scanner;

public class Mission06 {

	public static void main(String[] args) {
		// 메뉴 선택 -> 해당 메뉴 명령 실행
		// 1. 추가 2. 출력 3. 검색 4. 종료
		// String 배열
		// 1: 배열에 데이터 추가 2: 배열에 있는 모든 데이터 출력 3 : 해당 문자의 문자열 없으면 없다고 출력
		
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[100];
		arr[0] = "1"; // 위치 확인용
		int answer;

		while (true) {
			System.out.println("1. 추가 2. 출력 3. 검색 4. 종료");
			System.out.print("입력 : ");
			answer = sc.nextInt();
			sc.nextLine();
			switch (answer) {
			case 1:
				System.out.print("추가할 문자를 입력해주세요 : ");
				String s = sc.nextLine();
				add(arr, s);
				break;
			case 2:
				print(arr);
				break;
			case 3:
				System.out.print("검색할 문자를 입력해주세요 : ");
				String find = sc.nextLine();
				find(arr, find);
				break;
			case 4:
				System.out.println("시스템을 종료합니다.");
				sc.close();
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
			System.out.println();
		}
	}

	static void add(String[] arr, String s) {
		int num = Integer.parseInt(arr[0]);
		arr[num++] = s;
		arr[0] = num + "";
	}

	static void print(String[] arr) {
		if (Integer.parseInt(arr[0]) < 2) {
			System.out.println("저장된 문자가 없습니다.");
		} else {
			for (int i = 1; i < arr.length; i++)
				if (arr[i] == null)
					break;
				else
					System.out.print(arr[i] + "    ");
			System.out.println();
		}
	}

	static void find(String[] arr, String s) {
		int temp = -1;
		for (int i = 1; i < arr.length; i++) {
			if (s.equals(arr[i])) {
				temp = i;
				break;
			}
		}
		if(temp < 0)
			System.out.println("해당 문자를 찾을 수 없습니다.");
		else
			System.out.println(temp + "번째 인덱스에 저장되어 있습니다.");
	
	}
}
