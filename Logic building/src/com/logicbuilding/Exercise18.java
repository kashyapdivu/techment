package com.logicbuilding;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter First Number : ");
			int num1 = scanner.nextInt();
			System.out.println("Enter Second Number : ");
			int num2 = scanner.nextInt();

			int result = num1 / num2;
			System.out.println("Result : " + result);
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException " );
		} finally {
			System.out.println("Inside finally block.");
		}

	}

}
