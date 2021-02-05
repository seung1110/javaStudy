package kosta.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderExam {

	public static void main(String[] args) {
		File f = new File("poem.txt");
		FileReader reader = null;
		char arr[] = new char[10]; 
		StringBuffer sb = new StringBuffer();

		try {
			reader = new FileReader(f);

			while (true) {   // 문자 하나씩
				int data = reader.read(); // 아스키코드 반환
				if (data < 0)
					break;
				char c = (char)data;
				sb.append(c);
				System.out.print(c);
			}
//			while(true) {
//				Arrays.fill(arr,' '); // 쓰레기 값 제거를 위해 매번 초기화
//				int data = reader.read(arr); // 배열 사이즈만큼 읽는다, 배열에 저장  , 읽을게 없으면 -1 반환
//				if(data == -1)
//					break;
//				System.out.print(arr);
//			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없음");
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
