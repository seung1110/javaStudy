package kosta.thread.mission;

public class Main {

	public static void main(String[] args) {
		DonationBox db = new DonationBox(20000000);

//		new Thread(new Contributor(db),"기부천사").start();
//		new Thread(new Contributor(db),"기부악마").start();
//		new Thread(new Contributor(db),"기부장인").start();
//		new Thread(new Contributor(db),"기부덕후").start();

		Contributor c1 = new Contributor(db, "기부장인");
		Contributor c2 = new Contributor(db, "익명의 기부자");
		Contributor c3 = new Contributor(db, "기부천사");
		Contributor c4 = new Contributor(db, "기부덕후");

		c1.start();
		c2.start();
		c3.start();
		c4.start();

		try {
			c1.join();
			c2.join();
			c3.join();
			c4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("총 모금액 : " + (c1.getTotal() + c2.getTotal() + c3.getTotal() + c4.getTotal()) + "원");

	}

}
