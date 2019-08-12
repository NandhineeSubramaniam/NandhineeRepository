package com.asminds.single;

public class Employee {
	static Employee e=new Employee();
	private Employee() {
		
	}
	static Employee display() {
		return e;
	}

}
