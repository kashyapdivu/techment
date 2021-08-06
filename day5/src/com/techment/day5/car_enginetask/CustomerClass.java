package com.techment.day5.car_enginetask;

 class CustomerClass {

	int customerId;
	String customerName;
	AccountClass account;
	
	public CustomerClass(int customerId, String customerName, AccountClass account) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.account = account;
	}
	
	
	void customerDetails() {
	    System.out.println("Customer Details:");
	    System.out.println("Id: " +customerId);
	    System.out.println("Name: " +customerName);
	    System.out.println("Account Number: " + account.accountId);
	    System.out.println("IFSC Number: "+ account.Ifsc);
	    System.out.println("Branch: " +account.branch);
	    System.out.println("Balance: " +account.balance);
	}
	
}
