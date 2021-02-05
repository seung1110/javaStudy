package kosta.io;

import java.io.File;

public class FileMission {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\KOSTA\\Desktop\\new");
		File des = new File("C:\\Users\\KOSTA\\Desktop\\copyNew");

		CopyUtill.copyDir(f, des);
//		show(f);
		
	}
	static void show(File f) {
		
		if(f.exists()) {
			if(f.isDirectory()) {
				File[] fs = f.listFiles();
				System.out.println("************* 디렉토리 명 : " + f.getName() + "     ************* ");
				
				for(File ff : fs) {
					show(ff);
				}
			}
			else {
			System.out.println(" - 파일명 : " + f.getName());
//			System.out.println("파일 사이즈 : " + f.length());
//			System.out.println("파일 경로 : " + f.getAbsolutePath());
			System.out.println("상위 디렉토리 : " + f.getParent());
			}
		}
		else
			System.out.println("파일이 없습니다.");
	}
}
