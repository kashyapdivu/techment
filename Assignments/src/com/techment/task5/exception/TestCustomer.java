package com.techment.task5.exception;

import java.util.Scanner;

class Customer{
	private String custNo;
	private String custName;
	private String category;
	
	public Customer(String custNo, String custName, String category) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		if(custNo.startsWith("C") ||  custNo.startsWith("c"))
		 this.custNo = custNo;
	}
	
	public String getCustName() {
	
		return custName;
	}
	
	public void setCustName(String custName) {
		if(custName.length() >=4)
		 this.custName = custName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		if(category.equals("Platinum") || category.equals("Gold") || 
				category.equals("Silver"))
		   this.category = category;
	}
	
	
	
}



public class TestCustomer {

	public static void main(String[] args) {
		Scanner scan  = new  Scanner(System.in);
		String customerID, customerName,customerCategory;
		
		System.out.println("Enter customer details:");
		try {
		   System.out.println("\nEnter Customer Id:");
		   customerID=scan.next();
			System.out.println();
			 System.out.println("\nEnter Customer Name:");
			 customerName=scan.nextLine();
				System.out.println();
				 System.out.print("\nEnter Customer Category:");
					scan.next();
					
					Customer cust = new Customer(customerID,customerName,customerCategory)
					
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
		
	}

}
