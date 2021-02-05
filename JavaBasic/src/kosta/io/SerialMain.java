package kosta.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialMain {
	public static void main(String[] args) {
		SerialMain sm = new SerialMain();
		
		sm.write(); // 직렬화를 통해 객체 저장
		Member member = sm.read();  // 역직렬화를 통해 객체 가져옴
			
		System.out.println("이름 : " + member.getName() +" 나이 : "+ member.getAge());
	}
	
	public void write() {
		Member m = new Member("홍길동",20);
		ObjectOutputStream oos = null;
	
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	public Member read() {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			return (Member) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
