package kosta.thread;

public class Mission {
	static int sum = 0;
	public static void main(String[] args) {
//		Thread t1 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for(int i = 1; i <=50;i++) {
//					sum += i;
//				}
//	
//			}
//		});
//		Thread t2 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for(int i = 51; i <= 100; i++)
//					sum += i;
//			}
//		});
//		
//		t1.start();
//		t2.start();
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(sum);
		
		Sum_Thread s1 = new Sum_Thread(1, 50);
		Sum_Thread s2 = new Sum_Thread(51, 100);
		s1.start();
		s2.start();
		
		try {
			s1.join();
			s2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(s1.getSum() + s2.getSum());
		
	}

}
