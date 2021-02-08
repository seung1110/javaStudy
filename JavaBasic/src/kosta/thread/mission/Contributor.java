package kosta.thread.mission;

public class Contributor extends Thread{
	private DonationBox db;
	private int total;
	private int times = 0;
	
	
	Contributor(DonationBox db){
		this.db = db;
	}
	Contributor(DonationBox db,String name){
		this.db = db;
		this.setName(name);
	}
	
	public void run() {
		while(!db.check()) {
			int amount = (int)(Math.random() *9 +1 )*100000;
			boolean ch = db.donation(amount);
			
			if(ch) {
				this.total += amount;
				this.times++;
			}
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() +"님이 "+times+"번의 기부를 통해 총 " + total+"원을 기부하셨습니다.");
		
	}
	
	public int getTotal() {
		return total;
	}

}
