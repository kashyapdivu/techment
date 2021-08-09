package com.logicbuilding;

import java.util.Scanner;

/*
 * WAP that Enter 3 sides of the tringle into 3 variables and check if sum of any
two sides is always bigger than the third side . 
 */

public class Exercise52 {

	public static int checkTriangle(int a,
	                                int b, int c)
	    {
	        if (a + b <= c || a + c <= b || b + c <= a)
	            return 0;
	        else
	            return 1;
	    }
	 
	    // Driver function
	    public static void main(String args[])
	    {
	 
	        int side1 , side2, side3; //user input3 sides of triangle.
	 
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter 3 sides of triangle: ");
	        side1=scanner.nextInt();
	        side2=scanner.nextInt();
	        side3=scanner.nextInt();

             if ((checkTriangle(side1 ,side2,side3)) == 1)
	            System.out.print("Valid");
	        else
	            System.out.print("Invalid");
	         
	    }
	}
	 