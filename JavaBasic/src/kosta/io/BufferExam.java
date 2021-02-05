package kosta.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferExam {

	public static void main(String[] args) {
		InputStream in = System.in; // 키보드 입력
		InputStreamReader isr = new InputStreamReader(in); // InputStreamReader은 부모가 Reader
        //		InputStreamReader inReader = new InputStreamReader(System.in);    // 위의 두줄과 같은 의미
		BufferedReader br1 = new BufferedReader(isr); // BufferedReader의 생성을 위해서는 Reader객체가 파라미터로 필요

		BufferedReader br = null;
		BufferedWriter bw = null;
		String str;

		try {
			br = new BufferedReader(new InputStreamReader(System.in)); // br1을 생성한 세줄과 같은 의미
			bw = new BufferedWriter(new FileWriter("output.txt"));

			System.out.println("내용을 입력해주세요");

			while ((str = br.readLine()) != null) { // ctrl+z 입력 전까지
				str += "\n"; // 받은 입력에 개행문자 추가
				bw.write(str); // str의 내용을 파일에 쓴다.
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
