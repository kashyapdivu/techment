package com.techment.day4.polymormphism;

class Bank{
	
	public void rateOfInterest() {
		System.out.println("3%");
	}
	
	public void openAccount() {
		System.out.println("Above 18 can vote");
	}
	
}

class SBI extends Bank {
	public void rateOfInterest() {
		System.out.println("7%");
	}
	public void loan() {
		
	}
}

class Axis extends Bank{
	public void rateOfInterest() {
		System.out.println("8%");
	}
}

class IDBI extends Bank{
	
}



public class OverridingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//SBI sbi = new SBI();
//Axis axis = new Axis();
//IDBI idbi = new IDBI();
//sbi.rateOfInterest();
//axis.rateOfInterest();
//idbi.rateOfInterest();

Bank bank = new IDBI();  //upcasting
bank.rateOfInterest();
bank.openAccount();



	}

}
