package com.techment.day13.methodreference;

interface Calculation{
	void display();
}


class Hello{
	void message() {
		System.out.println("Today is holiday");
	}
}

public class MethodReferencedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//by using lambda expression
		Calculation calculation1 = ()->System.out.println("today is holiday by Lmba Expression");
		calculation1.display();
		
		//method reference to non static method (or) instance method
		Hello hello = new Hello();
		Calculation calculation2 = hello :: message;
		calculation2.display();
		
	}

}
