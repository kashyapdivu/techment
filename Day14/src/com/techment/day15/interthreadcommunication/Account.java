package com.techment.day15.interthreadcommunication;

public class Account {

	int balance = 0 ;
	
	public int withdraw(int amount) {
		if(amount> balance) {
			try {
				System.out.println("No balance waiting to deposit..");
			     wait();
			   
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName());
		balance -=amount;
		return balance;
	}
	
	
	synchronized public int  deposit(int amount) {
		
		System.out.println(Thread.currentThread().getName()+"is going to deposited");
		balance +=amount;
		
		
		return balance;
	}
	
	
}
