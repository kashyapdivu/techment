package com.logicbuilding;

import java.util.Random;

public class Exercise27 {

	public static void main(String[] args) {


		Random  random = new Random();
		int number1 = random.nextInt();
		
	
		int  number2 = random.nextInt();
		
		
		if(number1%2==0 && number2%2==0)
		{
			System.out.println("Both numbers are same :"+(number1+number2));
		}
		else
		{
			System.out.println("Both numbers are different :"+Math.abs(number1-number2));
		}
		
	}

}
