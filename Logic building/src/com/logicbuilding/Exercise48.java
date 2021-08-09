package com.logicbuilding;

public class Exercise48 {

	public static void main(String[] args) {
		 int num = 11011001;
	        System.out.println(binaryToDecimal(num));
	}

	private static int binaryToDecimal(int number) {
		    int num = number;
	        int result = 0;
	 
	        int base = 1;
	 
	        int temp = num;
	        while (temp > 0) {
	            int last_digit = temp % 10;
	            temp = temp / 10;
	            result += last_digit * base;
	            
	           // result += (Math.pow(last_digit, base));
	 
	            base = base * 2;
	        }
		
		return result;
	}

}
