package com.techment.model;

public class Department {

	String hodName;

	public void setHodName(String hodName) {
		this.hodName = hodName;
	}

	public void deptDetails() {

		System.out.println("This is department details.");
		System.out.println("Hod Name : " + hodName);
	}

}
