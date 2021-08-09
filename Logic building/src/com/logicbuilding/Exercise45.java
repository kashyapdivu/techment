package com.logicbuilding;

import java.util.Scanner;

public class Exercise45 {

	public static void main(String[] args) {
		
		int actualPinNumber = 12345;
		int i = 1;
		int pinNumber ;
		boolean flag =  false;
		Scanner scanner = new Scanner(System.in);
        System.out.println("Only 3 attempts are allowed.");
		
        while (i <= 3) {
			System.out.print("Enter Pin Number : ");
			pinNumber = scanner.nextInt();
			if (actualPinNumber == pinNumber) {
				//System.out.println("” PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
				flag = true;
				break;
			} else {
				System.out.println("PIN NOT ACCEPTED,Try Again...\n");
			    i++;
			    flag = false;
			}   
		}

        if(flag) {
        	System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        }else {
        	System.out.println("YOU HAVE RUN OUT OF TRIES.\r\n"
        			+ "ACCOUNT LOCKED.");
        }	
	}

}
