package kosta.thread;

public class Customer extends Thread{
	private String threadName;
	private Manager m;
	public Customer() {}
	public Customer(String n, Manager m) {
		this.threadName = n;
		this.m = m;
	}
	
	
	public void run() {
		for(int i = 0; i < 20; i++)
			m.pop(this.threadName);
	}
}
