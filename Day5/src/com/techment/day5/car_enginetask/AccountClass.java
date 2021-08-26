package com.techment.day5.car_enginetask;

 class AccountClass {
	
	int accountId;
	int balance;
	String branch;
	String Ifsc;
	
	public AccountClass(int accountId, int balance, String branch, String ifsc) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.branch = branch;
		Ifsc = ifsc;
	}
	
	String checkAccountStatus() {
		if(balance == 0)
			   return "Zero Balance Account";
    	 if(balance >=500  &&  balance <=50000)  
	 		return "Saving  Account";
		if(balance > 50000)
				return "Current Account";
			
		return "Invalid";
		
		
	}
	
	

}
