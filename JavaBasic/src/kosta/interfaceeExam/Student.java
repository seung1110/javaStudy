package kosta.interfaceeExam;

public class Student extends Man{

	public Student() {}

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void speak() {
		System.out.println(super.getName() + " 공부나 열심히 해");
	}

}
