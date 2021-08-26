package com.techment.day6.customeexception;

public class Account {
int balance =  5000;
	 String withdraw(int amount) {
		 if(amount > balance)
			 throw new InSufficientFundException("Insufficient Fund.");
		else
			return "You have withdraw " +amount + " amount.";
			//System.out.println("Withdraw Successfully");
			
	 }
}
