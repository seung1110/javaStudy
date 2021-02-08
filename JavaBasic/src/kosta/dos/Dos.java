package kosta.dos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Dos {

	public static void main(String[] args) {
		File current = new File("C:\\");
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print(current.getPath() + " >");
		while (!(str = sc.nextLine()).equals("exit")) {
			String[] arr = str.split(" ");
			switch (arr[0]) {
			case "ls":
				print(current);
				break;
			case "cd":
				current = changeDir(current, arr[1]);
				System.out.println(current.getPath());
				break;
			case "mkdir":
				if (arr.length > 1) {
					makeDir(current, arr[1]);
				} else {
					System.out.println("잘못된 입력입니다.");
				}
				break;
			case "cp":
				if (arr.length > 1)
					copyDir(new File(arr[1]), current);
				break;
			default:
				System.out.println("지원하는 명령어가 아닙니다.");
				break;
			}
			System.out.println();
			System.out.print(current.getPath() + " >");
		}
	}

	public static void print(File f) {
		File[] files = f.listFiles();
		for (File i : files) {
			if(i.isDirectory())
				System.out.println(i.getName()+"<Dir>");
			else
				System.out.println(i.getName());
		}
	}

	public static File changeDir(File f, String path) {

		if (path.matches("\\..")) {
			try {
				File c = new File(f.getParent());
				return c;
			} catch (NullPointerException e) {
				return f;
			}
		} else if (path.matches("\\.*"))
			return f;
		else {
			File newFile = new File(f, path);
			if (newFile.exists())
				return newFile;
			else
				return f;
		}
	}

	public static void makeDir(File f, String path) {

		File dir = new File(f, path);
		if (dir.mkdir())
			System.out.println("디렉토리가 생성되었습니다.");
		else
			System.out.println("디렉토리 생성에 실패하였습니다.");
	}

	public static void copyDir(File f, File dest) {
		try {
			if (!f.exists())
				System.out.println("존재하지 않는 경로입니다.");
			else {
				if (f.isDirectory()) {
					File[] files = f.listFiles();
					for (File i : files) {
						if (i.isDirectory()) {
							File dir = new File(dest, i.getName());
							dir.mkdir();
							copyDir(i, dir);
						} else {
							copyFile(i, new File(dest, i.getName()));
						}
					}
				} else {
					copyFile(f, new File(dest, f.getName()));
				}
			}
		} catch (Exception e) {
			System.out.println("잘못된 경로입니다.");
		}

	}

	public static void copyFile(File s, File dest) {
		if (!dest.exists())
			try {
				dest.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(s);
			out = new FileOutputStream(dest);
			while (true) {
				int data = in.read();
				if (data == -1)
					break;
				out.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
