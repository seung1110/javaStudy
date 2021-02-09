package kosta.net3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.URLDecoder;

public class ClientRecieve extends Thread{
	Socket socket;

	public ClientRecieve() {
	}

	public ClientRecieve(Socket s) {
		socket = s;
	}

	public void run() {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String str = br.readLine();
				if (str == null) {
					System.out.println("상대방이 나갔습니다.");
					break;
				}
				String str2 = URLDecoder.decode(str,"utf-8");
				System.out.println(str2);
			}
			System.out.println("종료");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}
}
