package kosta.interfaceeExam;

public class Work extends Man implements Speakable {

	public Work() {}
	
	public Work(String name) {
		super(name);
	}
	
	@Override
	public void speak() {
		System.out.println(super.getName() + " 열심히 일해야 한다.");
		
	}
	

}
