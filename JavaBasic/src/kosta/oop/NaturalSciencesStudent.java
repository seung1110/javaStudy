package kosta.oop;

public class NaturalSciencesStudent extends Student {
	private int science;
	
	 public NaturalSciencesStudent() {}
	
	public NaturalSciencesStudent(int no, String name, int kor, int eng, int math, int science) {
		super(no, name, kor, eng, math);
		this.science = science;
		super.setTotal(super.getTotal() + science);
		super.setAvg(super.getTotal()/4.0);
	}

	@Override
	public void print() {
		System.out.println(super.getNo() +"\t"+super.getName()+"\t"+ 
	super.getKor()+"\t"+ super.getEng()+"\t"+ super.getMath()+"\t"+""+"\t"+this.science+"\t"+ super.getTotal()+"\t"+ super.getAvg());
	};
	
}
