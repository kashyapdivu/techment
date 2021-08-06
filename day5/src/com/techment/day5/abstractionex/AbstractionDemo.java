package com.techment.day5.abstractionex;

abstract class Bank
{
	void openAccount() {
		
	}
	
void Eligibility() {
		System.out.println("Above 18 can open their account");
	}
abstract int rateOfInterest(int interestRate) ;

}

//when any class extend abstract class means it need to provide implementation of abstract method,not leave it..
class Axis extends Bank{
	
	int rateOfInterest(int interestRate) {
		interestRate = 2*interestRate;
		return interestRate;
	}
	
}

class SBI extends Bank{

	@Override
	int rateOfInterest(int interestRate) {
	//	interestRate = 2*interestRate;
		System.out.println("SBI Interest rate : "+interestRate);
		return interestRate;
	
	}
	
	
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		
		Bank bank = new SBI();
		bank.Eligibility();
		bank.rateOfInterest(6);
	  	
		
	}

}
