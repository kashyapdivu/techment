package com.techment.day8.test;

class Employee {
	String firstName;
	String lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

public class Program2 {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Ravi", "Verma");
		Employee employee2 = new Employee("Saket", "Gupta");
		Employee employee3 = new Employee("Mirij", "Sharma");

		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
	}

}
