package com.techment.day4.superexam;

class Parent{
	int a= 20;
}

class Child extends Parent{
	int a =10;      //global for child
	void sum() {
		int a =5; //local variable
		
		int c =a+a;
		System.out.println("sum: "+c);

		int d =this.a+a;
		System.out.println("sum: "+d);
		
		int e =super.a+a;
		System.out.println("sum: "+e);
		
		int f =super.a+this.a;
		System.out.println("sum: "+f);
	}
}

public class SuperClass {
public static void main(String[] args) {
	Child child  = new Child();
	child.sum();
}
}
