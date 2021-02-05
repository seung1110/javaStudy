package kosta.api;

import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		// String 객체 생성
		String str = "ABC"; // 기본형 타입처럼 생성, 기존에 생성된 ABC가 있으면 그 문자열을 참조해서 사용
		String str1 = new String("abc"); // 무조건 새로 만듬

		// String 불변성
		str.concat(str1);
		System.out.println(str.concat(str1)); // ABCabc 출력
		System.out.println(str); // ABC 출력
		String str2 = str.concat(str1);
		System.out.println(str2); // ABCabc 출력

		String sql = "select * from board ";
		int num = 10;
		if (num == 10) {
			sql += "where num = 10"; // 연산자를 통해 String 변경
		}
		System.out.println(sql);

		// String 가변성 buffer 동기화 지원 멀티 쓰레드에서 안전, builder는 지원 X
		StringBuffer sb = new StringBuffer("가나다"); // 가변성의 특징을 가진 문자열
		sb.append("라마바");
		System.out.println(sb); // 가나다라마바 출력
		sb.insert(0, "한글"); // 한글가나다라마바 출력
		System.out.println(sb);
		sb.insert(1, "한글"); // 한한글글가나다라마바 출력
		System.out.println(sb);
		StringBuilder sbu = new StringBuilder("abc");
		sbu.append("def");
		System.out.println(sbu);

		// 해당 문자의 위치 파악
		System.out.println(sql.indexOf("*")); // 7 출력
		System.out.println(sql.indexOf("$")); // -1 출력 해당 값이 없으면 -1 출력

		// 문자열 길이
		System.out.println(sql.length()); // 34 출력 (공백 포함)

		// 문자열 추출
		System.out.println(sql.substring(1)); // elect * from board where num = 10 출력 첫번째부터 시작
		System.out.println(sql.substring(0, 2)); // se 출력 0~1번째까지

		// 추출 예제
		System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board") + "board".length()));

		String fileName = "사진.jpg", head, pattern;
		head = fileName.substring(0, fileName.indexOf("."));
		pattern = fileName.substring(fileName.indexOf(".") + 1);
		System.out.println(head + " : " + pattern);

		String id = "kosta";
		String m_id = "kosta ";
		String u_id = "Kosta";
		System.out.println(id.equals(m_id)); // false 출력 공백 차이로
		System.out.println(id.equals(m_id.trim())); // true 출력 공백문자 제거됨
		System.out.println(id.equals(u_id)); // false 출력 대소문자 구분
		System.out.println(id.equalsIgnoreCase(u_id)); // true 출력 대소문자 구분없이 비교

		// 문자열 => 배열
		String fruit = "사과 배 딸기";
		String fruits[] = fruit.split(" "); // 공백으로 구분해서 array로 반환
		System.out.println(Arrays.toString(fruits)); // [사과, 배, 딸기] 출력

		// startswith, endsWith
		String start = "Start a";
		System.out.println(start.startsWith("Start"));

		System.out.println(start.endsWith("a"));

		if (fileName.endsWith(".jpg"))
			System.out.println("이미지 파일입니다.");
		else
			System.out.println("이미지 파일이 아닙니다.");

		String path = "C:\\Users\\KOSTA\\Desktop\\workspace\\사진\\kosta.jpg";
		File fi = new File(path);
		System.out.println(fi.canRead());
		System.out.println(fi.getName());

		String newName = "kosta_small" + fi.getName().substring(fi.getName().indexOf("."));
		File fi2 = new File(path.substring(0, path.indexOf(fi.getName())) + newName);
		System.out.println(fi.renameTo(fi2));

	}

}
