package com.techment.model;

public class Employee {

	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	

	

	public Employee(String name) {
		super();
		this.name = name;
		System.out.println("name constructor called..");
	}





	public Employee(int id, int salary) {
		super();
		this.id = id;
		this.salary = salary;
	}





	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}







	public Employee(int id) {
		super();
		this.id = id;
		System.out.println("id constructor called.");
	}





	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
