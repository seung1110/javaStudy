package my.test;

public class Dug extends Animal{
	boolean wing;
	
	public Dug() {
//		super(2);
		super.leg = 2;
	}
	
	
	public void fly() {
		System.out.println("fly");
	}
}
