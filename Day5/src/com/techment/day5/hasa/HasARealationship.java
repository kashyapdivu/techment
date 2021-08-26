package com.techment.day5.hasa;

class Employee{
	
	int id;
	String name;
	
	Address address;  //object reference - Has-A relation

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void displayEmployeeInfo(){
		System.out.println("Id: " +id);
		System.out.println("Name: " + name);
		System.out.println("Door Number: " + address.doorNo);
		System.out.println("Street name: " + address.streetName);
		System.out.println("Door Number: " + address.city);
		System.out.println("Door Number: " + address.pinCode);
	}
}

//address class...
class Address{
	int doorNo;
	String streetName;
	String city;
	int pinCode;
	
	public Address(int doorNo, String streetName, String city, int pinCode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	
}

public class HasARealationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Address address = new Address(1001,"Raipur","Raipur",492001);
		
        Employee emp = new Employee(1,"Xyz",address);
        
       emp.displayEmployeeInfo(); 
	}

}
