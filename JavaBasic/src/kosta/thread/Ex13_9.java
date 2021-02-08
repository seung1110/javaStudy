package kosta.thread;

import javax.swing.JOptionPane;

public class Ex13_9 {

	public static void main(String[] args) { // interrupt 예제
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			int i = 10;
			while(i !=0 && !Thread.interrupted()) {
				System.out.println(i--);
				for(long x = 0; x < 2500000000L;x++);
			}
			System.out.println("카운트 종료");
			}
		});
		
		t1.start();
		String input = JOptionPane.showInputDialog("입력" );
		System.out.println(input);
		t1.interrupt();
		System.out.println(t1.isInterrupted());
	}

}
