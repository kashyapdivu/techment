package com.logicbuilding;

import java.util.Scanner;

/*
 * Write a Java program to find the sum of the series: 1/1! + 2/2! + 3/3! + ……1/N! 
 */

public class Exercise46 {

	public static double fact(int num)
    {
        if (num == 1) {
            return 1;
        }
       return num * fact(num - 1);
    }
  
    public static double calculateSum(int num)
    {
        double sum = 0;
  
        for (int i = 1; i <= num; i++) {
            sum = sum + ((double)i / fact(i));
        }
  
        return sum;
    }
  
    public static void main(String[] args)
    {
    	Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the no. of terms in series: ");
		int num = scanner.nextInt();
        System.out.println("Sum of series:  "
                           + calculateSum(num));
    }
}

