package my.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File f = new File("‪‪C:\\Users\\KOSTA\\Desktop\\workspace\\test.txt");
		System.out.println(f.canRead());
		System.out.println(f.getName());
		FileReader fr = null;

		try {
			fr = new FileReader(f);

			while (true) {
				int data = fr.read(); // 문자 하나 리턴(아스키 코드 값) 없으면 -1
				char c = (char)data;
				System.out.print(c);

			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없음");
		}
		catch(IOException e) {
		System.out.println("파일을 읽을 수 없음");
		}


	}

}
