package kosta.net3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread {
	Socket socket;
	PrintWriter pw;
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());

	public PerClientThread() {
	}

	public PerClientThread(Socket socket) {
		this.socket = socket;
		try {	
			pw = new PrintWriter(socket.getOutputStream());
			list.add(pw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		String str,name = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw.flush();
			 name = br.readLine();
			sendAll(name + "님이 입장하셨습니다.");
			while (true) {
				str = br.readLine();
				if (str == null)
					break;
				sendAll(name + " : " + str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println(name + "님이 퇴장하셨습니다.");
			list.remove(this.pw);
			
		}

	}

	public void sendAll(String msg) {
		for (PrintWriter p : list) {
			p.println(msg);
			p.flush();
		}
	}

}
