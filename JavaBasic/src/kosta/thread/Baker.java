package kosta.thread;

public class Baker extends Thread {
	private String threadName;
	private Manager m;

	public Baker() {}
	public Baker(String n, Manager m) {
		this.threadName = n;
		this.m = m;
	}
	
	public void run() {
		
		for(int i = 0; i < 20; i ++) {
			m.push(this.threadName,getBread());
		}

	}

	public String getBread() {
		String bread = "";
		int n = (int)(Math.random()*3);
		
		switch (n) {
		case 0:
			bread = "생크림빵";
			break;
		case 1:
			bread = "단팥빵";
			break;
		case 2:
			bread = "피자빵";
			break;
		}
	
		return bread;
	}
}
