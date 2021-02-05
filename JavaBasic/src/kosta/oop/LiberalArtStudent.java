package kosta.oop;

public class LiberalArtStudent extends Student{
		private int social;
	
		
		public LiberalArtStudent(int no, String name, int kor, int eng, int math, int social) {
			super(no, name, kor, eng, math);
			this.social = social;
			super.setTotal(super.getTotal() + social);
			super.setAvg(super.getTotal()/4.0);
		}

		@Override
		public void print() {
			System.out.println(super.getNo() +"\t"+super.getName()+"\t"+ 
		super.getKor()+"\t"+ super.getEng()+"\t"+ super.getMath()+"\t"+this.social+"\t" +" "+"\t"+ super.getTotal()+"\t"+ super.getAvg());
		};
		
		

}
