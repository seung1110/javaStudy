package kosta.thread;

public class MultiThreadExam {

	public static void main(String[] args) {
//		Thread t = new DigitThread();
//		t.start();
//		for(char c = 'A'; c <='Z';c++ ) {
//			System.out.print(c);
//			try {
//				Thread.sleep(350);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		Thread t = new Thread(new SmallLetters());
		t.start();
		char arr[] = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		for(char c : arr)
			System.out.print(c);
	}

}
