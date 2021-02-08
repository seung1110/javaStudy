package kosta.thread.mission;

public class DonationBox {
	private int donation;
	private int box_max = 10000000;
	public DonationBox() {}
	public DonationBox(int box_max) {
		this.box_max=box_max;
	}
	
	
	public synchronized boolean donation(int amount) {
		if(this.donation >= box_max || this.donation+amount > box_max) {
			return false;
		}
		else {
			this.donation += amount;
			System.out.println(Thread.currentThread().getName() + "님이 " + amount+"원을 기부하였습니다.");
			return true;
		}
	}
	
	public boolean check() {return(this.donation == box_max);}

}
