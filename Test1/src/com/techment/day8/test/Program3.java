package com.techment.day8.test;


class Employee1 {
	String firstName;
	String lastName;

	public Employee1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	@Override
//	public String toString() {
//		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
//	}

}



public class Program3 {

	public static void main(String[] args) throws LessThanThreeException {
		Employee1 employee = new Employee1("", "Verma");
		 Validation(employee);
		
		
		
		
	}

	private static void Validation(Employee1 employee) throws LessThanThreeException {

		if(employee.getFirstName() == "" && employee.getLastName()=="") {
			 throw new NullPointerException("Entry Missing");
		}else if(employee.getFirstName().length() < 3 && employee.getLastName().length()<3)
			throw new LessThanThreeException("name should be minimum 3 character");
	}

	


	

	}
