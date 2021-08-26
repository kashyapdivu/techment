package com.techment.day15.interthreadcommunication;

public class InterThreadCommunication {

	public static void main(String[] args) {

        
		Account account = new Account();
		
		Thread t1 =  new Thread()
		{
			public void run() {
				account.withdraw(300);
			}
			
		};
		
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("After Deposit balance is :"+account.deposit(2000));
			}
			
		};
		
		t1.setName("Atm ");
		t2.setName("Bank ");
		
		t1.start();
		t2.start();
		
		
		
	}

}
