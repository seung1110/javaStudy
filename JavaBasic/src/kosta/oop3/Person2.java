package kosta.oop3;

public class Person2 {
	private String name;
	private Role2 role;
	
	public Person2() {}

	public Person2(String name, Role2 role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void doIt() {
		role.doIt();
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role2 getRole() {
		return role;
	}

	public void setRole(Role2 role) {
		this.role = role;
	}

	
}
