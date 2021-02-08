package kosta.thread;

public class SmallLetters implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char c = 'a'; c <= 'z';c++)
			System.out.print(c);
	}

}
