package com.techment.day13.methodreference;

@FunctionalInterface
interface Calculate{
	int add(int a, int b);
}

class Add{
	int addition(int a , int b) {
		return a+b;
	}
}

class Subtract{
	int subtraction(int a , int b) {
		return a-b;
	}
}


public class MethodReferenceDemo2 {

	public static void main(String[] args) {

		//by using lambda...
       Calculate cal = (a,b)->a+b;
       System.out.println( cal.add(2, 4));
		
		
       Calculate cal2 = (a,b)->a-b;
       System.out.println(cal2.add(20, 4));
       
       //by using method reference
       Add add1 = new Add();
       Calculate cal1 = add1:: addition;
       System.out.println(cal1.add(2,14));
       
       
       Subtract sub1 = new Subtract();
       Calculate cal3 = sub1:: subtraction;
       System.out.println(cal3.add(22,14));
       
       
       
	}

}
