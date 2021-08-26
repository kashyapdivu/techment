package com.techment.day13.methodreference;

@FunctionalInterface
interface Calculate2{
	 int calculation(int a, int b);
}

class MyCalculationUtil {
	int subtraction(int a , int b) {
		return a-b;
	}
	
	int addition(int a , int b) {
		return a+b;
	}
	
}

//by static 
public class MethodReferenceDemo4 {

	public static void main(String[] args) {
	     MyCalculationUtil calculationUtil = new MyCalculationUtil();
		 Calculate2 c2  =  calculationUtil::subtraction(4,2);		
		
		
		
		
	}

}
