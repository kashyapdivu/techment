package com.techment.model;

public class University {

	Department department;
	int noOfStudent;
	
	public void displayDeptDetails() {
		department.deptDetails();
		System.out.println("No of Student:" +noOfStudent);
	    
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "University [department=" + department + "]";
	}
	
	
	
}
