package kosta.thread;

public class Ex_13_6 {

	public static void main(String[] args) {//Thread priority 예제
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.print("-");
					for(int x = 0; x < 100000;x++);
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.print("|");
					for(int x = 0; x < 100000;x++);
				}
			}
		});
		t1.setPriority(1);
		t2.setPriority(10);
		System.out.println("priority of t1  : " + t1.getPriority());
		System.out.println("priority of t2  : " + t2.getPriority());
		t1.start();
		t2.start();

	}

}
