package kosta.thread;

public class Cook extends Thread{
	
	private Table t;
	
	Cook(Table table){
		this.t = table;
	}
	
	public void run() {
		
		while(true) {
			
			int idx = (int)(Math.random()*t.disNum());
			t.add(t.dishNames[idx]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
