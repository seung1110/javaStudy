package kosta.phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class PhoneInfoServer {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;

		try {
			server = new ServerSocket(9000);
			System.out.println("서버 실행");
			socket = server.accept();
			System.out.println("서버에 연결되었습니다.");

//			Thread t  = new ServerSend(socket);
//			t.join();
			ServerRecieve t = new ServerRecieve(socket);
			t.start();
			
			if(t.getData() != null) {
				String data = t.getData();
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String str = br.readLine();
				while(true) {
				if(str != null & str.equals("get")) {
				OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
				out.write(str);
				break;
				}
				}
				
			}

			t.join();


			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
