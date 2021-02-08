package kosta.thread;

import javax.swing.JOptionPane;

public class Ex_13_4 { // io blocking 예제

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 10; i > 0; i--) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}
				}
			}
		});
		t.start();
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 " + input);

	}
}
