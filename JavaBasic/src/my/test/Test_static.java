package my.test;

import javax.swing.JOptionPane;

public class Test_static {
	
	public static void main(String args[]) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i < 10; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}			
			}
		});
		t.start();
		String input = JOptionPane.showInputDialog("입력하세요");
		System.out.println("입력하신 값 : " + input);

		
	}

	


	public static class Thread1 extends Thread{
		public void run() {
			for(int i = 0; i < 300; i++)
				System.out.print("/");
		}
	}
	
	public static class Thread2 implements Runnable{
		
		@Override
		public void run() {
			for(int i = 0; i < 300; i++)
				System.out.print("*");
		}
	}
}
