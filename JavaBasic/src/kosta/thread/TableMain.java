package kosta.thread;

public class TableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table t = new Table();
		
		
		new Thread(new Cook(t),"요리사").start();
		new Thread(new Cust(t,"도넛"),"고객1").start();
		new Thread(new Cust(t,"버거"),"고객2").start();
		
		try {
			Thread.sleep(5000);
			System.exit(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
