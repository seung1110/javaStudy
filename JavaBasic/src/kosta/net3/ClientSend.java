package kosta.net3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URLEncoder;

public class ClientSend extends Thread{
	Socket socket;

	public ClientSend() {
	};

	public ClientSend(Socket s) {
		socket = s;
	};

	public void run() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());

			while (true) {
				String str = br.readLine();
				
				if (str == null)
					break;
				String str2 = URLEncoder.encode(str,"utf-8");
				writer.println(str2);
				writer.flush();
			}
			System.out.println("연결 종료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
