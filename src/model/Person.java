package model;

public abstract class Person {
	
	private String name;
	private String email;
	private String password;
	
	public Person() {
		
	}
	
	public Person(String name, String email,String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String ClientString() {
		return name + ", " + email ;
	}
	
	
	public String UserString() {
		return  name + ", " + email + ", " + password;
	}
	
}
