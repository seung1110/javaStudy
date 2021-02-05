package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class CopyUtill {

	public CopyUtill() {
	};

	public static void copyFile(File f1, File f2) {
		FileInputStream fs = null;
		FileOutputStream fo = null;
		byte[] arr = new byte[500];

		try {
			fs = new FileInputStream(f1);
			fo = new FileOutputStream(f2);

			while (true) {
				Arrays.fill(arr, (byte) (0));
				if (fs.read(arr) == -1)
					break;
				fo.write(arr);
			}
			System.out.println("파일이 복사되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fo != null)
					fo.close();
				if (fs != null)
					fs.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	public static void copyDir(File s , File des) {
		if(s.isDirectory()) {
			if(!des.exists()) {
				des.mkdir();
				System.out.println("처음 디렉토리 생성");
			}
			
			File fs[] = s.listFiles();
			
			for(File i : fs) {
				if(i.isDirectory()) {
				File newDir = new File(des.getPath() + "\\" + i.getName());
				newDir.mkdir();
				copyDir(i,newDir);
				}
				else {
					File newFile = new File(des.getPath() + "\\" + i.getName());
					try {
						newFile.createNewFile();
					} catch (IOException e) {
						System.out.println("오류");
					}
					copyDir(i,newFile);
				}
			}
		}
		else {
			copyFile(s, des);
		}
	}

}
