package kosta.oop3;

public class Main {

	public static void main(String[] args) {
		Study s = new Study();
		Work w = new Work();
		Person p = new Person("홍길동",s);

		p.doIt();
		p = new Person("홍길동",w);
		p.doIt();
		
		Study2 s2 = new Study2();
		Work2 w2 = new Work2();
		Person2 p2 = new Person2("김길동",s2);
		p2.doIt();
		p2 = new Person2("김길동",w2);
		p2.doIt();
	}

}
