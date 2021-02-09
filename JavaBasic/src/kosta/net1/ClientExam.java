package kosta.net1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null;
	
		try {
			socket = new Socket("192.168.0.125",9000); // 서버 ip와 포트 입력
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			String message = "Hello server!!!!";
			out.write(message.getBytes());
			
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println("서버가 보낸 메세지 : " + new String(arr));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
