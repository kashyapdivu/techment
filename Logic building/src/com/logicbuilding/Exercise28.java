package com.logicbuilding;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
		int actualPinNumber = 12345;
		int i = 1;
		int pinNumber;
		Scanner scanner = new Scanner(System.in);

		while (i > 0) {
			System.out.print("Enter Pin Number : ");
			pinNumber = scanner.nextInt();
			if (actualPinNumber == pinNumber) {
				System.out.println("Pin number accepted.");
				break;
			} else
				System.out.println("Wrong Pin Number,Try Again...\n");
			i++;
		}

	}

}
