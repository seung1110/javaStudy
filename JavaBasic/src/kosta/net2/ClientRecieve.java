package kosta.net2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

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
				if (str.equals("exit")) {
					System.out.println("상대방이 나갔습니다.");
					break;
				}
				System.out.println("클라이언트 수신 : " + str);
			}
			System.out.println("종료");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}
}
