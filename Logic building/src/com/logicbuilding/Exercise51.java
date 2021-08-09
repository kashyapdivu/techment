package com.logicbuilding;

import java.util.Scanner;
/*
 * Program to check Fascinating numbers and display the number. 
 */


public class Exercise51 {

	public static void main(String[] args) {
		System.out.println("Enter 3 digit Number:");
		Scanner scanner = new Scanner(System.in);
	    //System.out.println("Enter the no. of terms in series: ");
		int num = scanner.nextInt();
		
		
		if(num < 100)
			System.out.println("Enter 3 digit Number:");
		else
		{
			if (fascinatingNumber(num)) {
                System.out.println(num + " is a fascinating number!");
            } else {
                System.out.println(num + " is NOT a fascinating number!");
            }
        }

}

	private static boolean fascinatingNumber(int num) {
		String sVal = "" + num + num *2 + num * 3;
		for (int i = 1; i <= 9; i++) {
            int pos = sVal.indexOf(i + "");
            
            //System.out.print(pos+" ");
            if (pos < 0) {
                return false;
            } else {
                if (sVal.substring(pos+1).indexOf(i + "") >= 0) {
                    return false;
                }
            }
 
        }
        System.out.println(sVal);
	
		return true;
	}
}