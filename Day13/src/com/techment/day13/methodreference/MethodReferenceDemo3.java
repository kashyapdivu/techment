package com.techment.day13.methodreference;




@FunctionalInterface
interface Calculate1{
	int calculation(int a, int b);
}


class CalculationUtil {
	int subtraction(int a , int b) {
		return a-b;
	}
	
	int addition(int a , int b) {
		return a+b;
	}
	
}

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		

          CalculationUtil calculationUtil = new CalculationUtil();
          Calculate1 cal1 = calculationUtil:: addition;
          Calculate1 cal2 = calculationUtil:: subtraction;
         System.out.println( cal1.calculation(33,8));
         System.out.println(cal2.calculation(8, 4));
		
	}

}
