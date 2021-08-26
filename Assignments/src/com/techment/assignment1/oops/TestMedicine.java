package com.techment.assignment1.oops;

import java.time.LocalDate;

abstract class Medicine{
	private double price ;
	private LocalDate expiryDate ;
	
	
   void getDetails(){
		System.out.println("Price : "+price+"\n"+" ExpiryDate : "+expiryDate);
	}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public LocalDate getExpiryDate() {
	return expiryDate;
}


public void setExpiryDate(LocalDate expiryDate) {
	this.expiryDate = expiryDate;
}
   
//abstract method...
   abstract void displayLabel();
	
}


class Tablets extends Medicine{

	@Override
	void displayLabel() {
		System.out.println("Store in a cool dry place");	
	}
	
	
	
	
}

class Syrup extends Medicine{

	@Override
	void displayLabel() {
		System.out.println("Store in a cool dry place");	
	}
}


class Ointment extends Medicine{

	@Override
	void displayLabel() {
	System.out.println("for external use only");
	}
	
}

public class TestMedicine {

	public static void main(String[] args) {
		
		Medicine medicine =  new Medicine(100,12/12/2021);
		
		
	}

}
