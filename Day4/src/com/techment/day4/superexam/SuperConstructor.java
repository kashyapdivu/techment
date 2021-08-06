package com.techment.day4.superexam;

class Parent1 {
	int a;

	Parent1(int a) {
		System.out.println("this is a Parent1 Constructor " + a);
	}
}

class Child1 extends Parent1 {
	Child1(int x) {
		super(2);
		System.out.println("this is a Child Constructor " );
	}
}

public class SuperConstructor {
		public static void main(String[] args) {
			Child1 child1  = new Child1(4);
			
		}
}