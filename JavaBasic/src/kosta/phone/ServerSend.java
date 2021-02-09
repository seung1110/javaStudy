package kosta.phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerSend extends Thread {
	private Socket socket;

	public ServerSend(Socket s) {
		socket = s;
	}

	public void run() {


	}
}
