package com.asminds.singleton;

public class Employee {
	static Employee emp=new Employee();
	int id=10;
	private Employee(){
		
	}
	static Employee getInstance() {
		return emp;
	}
	
}
