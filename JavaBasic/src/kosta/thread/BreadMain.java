package kosta.thread;

public class BreadMain {

	public static void main(String[] args) {
		Manager m = new Manager();
		
		Baker b1 = new Baker("제빵왕",m);
		Baker b2 = new Baker("제빵남작",m);

		Customer c1 = new Customer("빵덕후",m);
		Customer c2 = new Customer("소비자",m);
		
		
		b1.start();
		b2.start();
		
		
		c1.start();
		c2.start();
	}

}
