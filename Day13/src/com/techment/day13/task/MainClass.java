package com.techment.day13.task;

 interface LargeNumber {
	void largest(int a, int b, int c);

}

class CalculationUtils{
	
	int findLargest(int a, int b ,int c) {
		
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else 
			return c;
	}
}



public class MainClass {

	public static void main(String[] args) {
		
		LargeNumber largeNumber =(a,b,c)->
		{
			CalculationUtils cal = new CalculationUtils();
			System.out.println(cal.findLargest(2, 30, 40));
			
		};
		
		
		
	}

}
