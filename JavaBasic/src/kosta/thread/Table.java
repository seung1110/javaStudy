package kosta.thread;

import java.util.ArrayList;

public class Table {

	String[] dishNames = { "도넛", "햄버거", "피자" };
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<String>();

	public synchronized void add(String dish) {
		if (dishes.size() >= MAX_FOOD)
			return;
		dishes.add(dish);
		System.out.println("Dishes : " + dishes.toString());
	}

	public boolean remove(String dishName) {
		synchronized (this) {
			while (dishes.size() == 0) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " 대기 중");
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				for (int i = 0; i < dishes.size(); i++) {
					if (dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						return true;
					}
				}
			}
			return false;
		}
		
	}
	
	public int disNum() {return dishNames.length;}

}
