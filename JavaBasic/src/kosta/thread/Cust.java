package kosta.thread;

public class Cust extends Thread{
	
	private Table t;
	private String food;
	
	Cust(Table table, String food){
		this.t = table;
		this.food = food;
	}
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String name = Thread.currentThread().getName();
			
			if(eatFood()) {
				System.out.println(name + "가 " + food + "를 먹었다.");
			}
			else
				System.out.println(name + "가 " + "음식을 먹지 못했다.");
			
		}
		
		
	}
	public boolean eatFood() {return t.remove(food);}

}
