package kosta.net1;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9000);  // 서버 소켓 생성
			System.out.println("서버 실행 중");
			socket = serverSocket.accept();  // 서버의 accept를 통해 client socket을 받아옴
			
			InputStream in = socket.getInputStream();
//			BufferedInputStream buffer = new BufferedInputStream(in);
			OutputStream out = socket.getOutputStream();
			
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.print("클라이언트가 보낸 메세지 : " + new String(arr));
			
			
			String message = "Hello Client";
			out.write(message.getBytes());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(socket != null)
					socket.close();
				if(serverSocket != null)
					serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
