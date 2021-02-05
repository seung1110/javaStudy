package kosta.sort;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	public int compareTo(Person o) {
//		// 나이 기준 내림차순
//		if(this.age > o.age)
//			return -1;
//		else if ( this.age < o.age)
//			return 1;
//		return 0;
//	}
	
	@Override
	public int compareTo(Person o) {
		// 이름 기준 오름차순    b.compareTo(a)   1    a.compareTo(b)    -1
		return this.name.compareTo(o.getName());
	}
		
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
