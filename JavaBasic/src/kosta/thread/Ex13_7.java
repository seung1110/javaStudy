package kosta.thread;

public class Ex13_7 {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (autoSave)
						autoSave();
				}

			}
		});
		
		t.setDaemon(true);
		t.start();
		for(int i  =1; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			if(i==5)
				autoSave = true;
		}
		System.out.println("시스템 종료");
	}

	protected static void autoSave() {
		System.out.println("저장되었습니다.");
	}
}
