package kosta.thread;

import java.util.ArrayList;
import java.util.List;

public class Manager {

	List<String> list = new ArrayList<String>();

	public synchronized void push(String name, String bread) {
		while (list.size() > 4) {
			try {
				System.out.println(name + " 대기 상태");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		list.add(bread);
		System.out.println(name + " : " + bread + " 만듦");
		System.out.println("진열장 빵 개수 : " + list.size());
		this.notify();
	}

	public synchronized void pop(String name) {
		while (list.size() == 0) {
			try {
				System.out.println(name + " 대기 상태");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String bread = list.remove(list.size()-1);
		System.out.println(name + " : " + bread + " 구매");
		this.notify();
	}

}
