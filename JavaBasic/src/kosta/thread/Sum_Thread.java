package kosta.thread;

public class Sum_Thread extends Thread{
	private int sum = 0;
	private int n1;
	private int n2;
	
	
	public Sum_Thread() {}
	public Sum_Thread(int a,int b) {
		this.n1 = a;
		this.n2 = b;
	}
	
	public void run() {
		for(int i = this.n1; i <=this.n2;i++)
			sum += i;
	}

	public int getSum() {
		return sum;
	}
}
