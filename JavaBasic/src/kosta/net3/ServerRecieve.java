package kosta.net3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.InputMap;

public class ServerRecieve extends Thread {
	Socket socket;

	public ServerRecieve() {
	}

	public ServerRecieve(Socket s) {
		socket = s;
	}

	public void run() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			while (true) {
				String str = br.readLine();
				if (str.equals("exit"))
					break;

				System.out.println("서버 수신 : " + str);
			}
			System.out.println("종료");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
