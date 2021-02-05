package kosta.exception;

public class Exam_Exception {
	public static void add() throws Exception { // 예외 회피
		int a = 10;
		int b = 0;
		a = a / b;
	}
	public static void multi() throws Exception{ // 예외를 인위적으로 발생
		int a = 10;
		int b = 10;
		if( a== b) 
			throw new Exception("같을 수 없다.");
	}

	public static void main(String[] args) {
//		add();
//		int a = 10;
//		int b = 0;
//		System.out.println("1");
		try {
//			a = a / b;
//			add();
			multi();
//			System.out.println("2");
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 예외 메세지
			e.printStackTrace(); // 예외의 발자취
//			System.out.println("3");
		} finally {
//			System.out.println("4");
		}
//		System.out.println("5");
	}
	// 예외클래스에 대한 이유를 알아야한다.
	// 예외 발생 => try-catch
}
