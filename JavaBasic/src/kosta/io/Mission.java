package kosta.io;

import java.io.File;


public class Mission {

	public static void main(String[] args) {
		
		//1. byte Stream 이용하여 파일 복사
//		String source = "‪C:\\Users\\KOSTA\\Desktop\\new\\java.jpg";
//		String source = "‪java.jpg";
//		String dest = "C:\\Users\\KOSTA\\Desktop\\copy.jpg";
		File f1 = new File("C:\\Users\\KOSTA\\Desktop\\new\\java.jpg");
		File f2 = new File("C:\\Users\\KOSTA\\Desktop\\copy.jpg");
	
//		String source = "‪poem2.txt";
//		String dest = "copy.txt";
		
		CopyUtill.copyFile(f1, f2);

	}

}	
