package web.controller.model;

import org.springframework.stereotype.Component;

@Component
public class Department {
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Department(int age) {
		super();
		this.age = age;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}