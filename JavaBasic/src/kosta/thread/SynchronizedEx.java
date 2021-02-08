package kosta.thread;

public class SynchronizedEx {

	public static void main(String[] args) {  // thread synchronized exam
		SharedArea sa = new SharedArea();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++)
					sa.transfer(1000000);
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 3; i++) {
				sa.getTotal();
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
				
			}
		});
		
		t1.start();
		t2.start();

	}

}
