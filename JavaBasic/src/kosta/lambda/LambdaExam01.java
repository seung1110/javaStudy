package kosta.lambda;

import kosta.oop.Product;

public class LambdaExam01 {

	public static void main(String[] args) {
//		MyType mt = new MyType() {
//			@Override
//			public void hello() {
//				System.out.println("익명 내부 클래스");
//			}
//		};
//		mt.hello();
//
//		MyType mt1 = () -> System.out.println("람다식 형식");
//		mt1.hello();
//
//		YourType yt = (String msg) -> System.out.println("나는 " + msg + "이다.");
//		yt.talk("람다식 형식");
//		
//		YourType yt2 = name -> System.out.println("나는 " + name + "이다.");
//		yt.talk("람다식 형식2");
//
		YourType yt1 = new YourType() {

			@Override
			public void talk(String msg) {
				System.out.println("나는" + msg + "이다.");
			}

			@Override
			public void print() {
				System.out.println("print");
				
			}
		};		
		

		MyNumber mn = (int n1,int n2) -> {
			if(n1>n2) return n1;
			else return n2;
		};
		
//		Test t1 = () -> System.out.println("asdad");
		
		execute(msg->System.out.println(msg + " hihihi"));

	
//		Runnable run = () ->{
//			for(int i = 1; i < 11; i++)
//				System.out.println(i);
//		};
//		
//		Thread t = new Thread(run);
//		t.start();


	
	
	}
	public static void execute(Test t) {
		t.print("execute");
	}
	public static MyType getMyType() {
		MyType mt2 = () -> System.out.println("hello2");
		return mt2;
	}

}
