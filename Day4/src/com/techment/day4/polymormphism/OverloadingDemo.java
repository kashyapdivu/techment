package com.techment.day4.polymormphism;

class Hello{
	
	public void write(int i) {
		System.out.println("You have written number and number is: "+i);
	}
	
	public void write(String i) {
		System.out.println("You have written String and String is: "+i);
	}
	
	public int addition(int a,int b) {
		return a+b;
	}

	public int addition(int a,int b,int c) {
		return a+b+c;
	}
	
}

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hello hello = new Hello();
      hello.write(7);
      hello.write("Divya");
      
     System.out.println("Sum= " +hello.addition(10, 60));
     System.out.println("Sum= "+ hello.addition(100, 60));
	}

}
