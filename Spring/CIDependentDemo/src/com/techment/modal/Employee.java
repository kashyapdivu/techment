package com.techment.modal;

public class Employee {
	String name;
	Address address;
	
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public void displayEmployeeDetails() {
		
		System.out.println("Name : "+name);
		System.out.println("City : "+address.cityName);
		System.out.println("Street : "+address.streetName);
		System.out.println("Zip : "+address.zipCode);
		System.out.println("State : "+address.stateName);
	}
	

}
