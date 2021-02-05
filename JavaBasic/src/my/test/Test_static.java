package my.test;

public class Test_static {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dug dug = new Dug();
		Animal animals[] = { new Cat(), new Dug()};
		Animal castingEx = new Animal();
		Cat catnew = (Cat)castingEx;
		catnew.printProperty();
		Object ob[] = new Object[10];

		cat.leg = 1;
		cat.printLeg();
		dug.printLeg();
		
		cat.printProperty();
		dug.printProperty();
		
		
		animals[0].printLeg();
		animals[1].printLeg();
		animals[0].printProperty();
		animals[1].printProperty();
	}

}
