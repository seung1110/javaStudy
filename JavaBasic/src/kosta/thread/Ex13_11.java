package kosta.thread;

public class Ex13_11 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 150; i++)
					System.out.print("-");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
				public void run() {
					for(int i = 0; i < 150; i++)
						System.out.print("|");
				
			}
		});
		t1.start();
		t2.start();
		long starTime = System.currentTimeMillis();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // main이 t1과 t2가 끝나길 기다리고 실행된다.
		System.out.println();
		System.out.println(System.currentTimeMillis() -starTime);
	}

}
