package kosta.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public class CopyExam {

	public static void main(String[] args) {	
		File f = new File("poem.txt");
		FileReader reader = null;
		FileWriter writer = null;
		StringBuffer sb = new StringBuffer();
	
		try {
			reader = new FileReader(f);
			while(true) {
			int data = reader.read();

			if(data < 0)
				break;
			sb.append((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			writer = new FileWriter("poem2.txt");
			writer.write(sb.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
