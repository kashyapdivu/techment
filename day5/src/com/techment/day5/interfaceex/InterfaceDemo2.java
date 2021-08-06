package com.techment.day5.interfaceex;

interface Bank1{
	void rateOfInterest();
}

class Axis implements Bank1{
	public void rateOfInterest() {
		System.out.println("Rate of Interest is 3%");
	}
}

class IDBI implements Bank1{
	public void rateOfInterest() {
		System.out.println("Rate of Interest is 13%");
	}	
}

class SBI implements Bank1{
	public void rateOfInterest() {
		System.out.println("Rate of Interest is 23%");
	}
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Bank1 bank = new SBI();
	}

}
