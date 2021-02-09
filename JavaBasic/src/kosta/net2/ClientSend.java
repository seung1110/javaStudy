package kosta.net2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

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

				if (str.equals("exit"))
					break;

				writer.println(str);
				writer.flush();
			}
			System.out.println("연결 종료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
