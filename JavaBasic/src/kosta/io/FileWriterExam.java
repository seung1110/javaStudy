package kosta.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExam {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("파일명 : ");
		String name = sc.nextLine();
		
		while(!(str = sc.nextLine()).equals("q")){
			sb.append(str+"\n");
		}
		
		FileWriter writer = null; // close 까먹지 말기
		
		try {
			writer = new FileWriter(name+".txt");
			writer.write(sb.toString());
			System.out.println("파일이 생성되었습니다.");
		} catch (IOException e) {

			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
