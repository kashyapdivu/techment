package com.techment.day18.modal;

public class Bank {
	
	String Name;
	String ifscCode;
	String branch;
	
	public void setName(String name) {
		Name = name;
	}
	
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
	public void displayBankDetails() {
		System.out.println("Name : "+Name);
		System.out.println("Ifcs : "+ifscCode);
         System.out.println("Branch : "+ branch);
	
	}

}
