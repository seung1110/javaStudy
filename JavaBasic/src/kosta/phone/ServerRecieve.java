package kosta.phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerRecieve extends Thread {
	private Socket socket;
	private String json;

	public ServerRecieve(Socket s) {
		this.socket = s;
	}

	public void run() {
		while (true) {
			BufferedReader br;

			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while (socket.isConnected()) {
					String str = br.readLine();

					if (str != null) {
						json = str;
					}

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public String getData() {
		return this.json;
	}
}
