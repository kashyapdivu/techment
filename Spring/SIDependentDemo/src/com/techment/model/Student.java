package com.techment.model;

public class Student {
	String name;
	String rollNo;
	String enrollment;
	Department department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getEnrollment() {
		return enrollment;
	}
	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void studentDetails() {
		System.out.println("Name : "+name);
		System.out.println("Enrollment : "+enrollment);
		System.out.println("Roll Number : "+rollNo);
		System.out.println("Department : "+ department.deptName);
		System.out.println("Branch : "+department.branch);
		System.out.println("Semeter :"+department.semester);
		
	}
	

}
