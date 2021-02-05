package kosta.oop;

public class Student {
	private int no, kor,eng,math,total;
	private double avg;
	private String name;
	
	public Student() {}

	public Student(int no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total/3.0;
		this.name = name;
	}
	
	public void print() {
		System.out.println(no +"\t"+name+"\t"+ kor +"\t"+ eng +"\t"+ math +"\t"+ total +"\t"+ avg);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
