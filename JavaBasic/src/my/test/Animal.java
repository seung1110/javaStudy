package my.test;

public class Animal {
	int leg;

	public Animal() {}
	public Animal(int leg) {
		this.leg = leg;
	}
	
	public void printLeg() {
		System.out.println(leg);
	}
    public void printProperty(){
        System.out.println("특징이 없습니다.");
    }
}
