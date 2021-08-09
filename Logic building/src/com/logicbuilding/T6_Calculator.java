package com.logicbuilding;

import java.util.Scanner;

public class T6_Calculator {

	public static void main(String[] args) {
		double number1, number2, result = 0.0;
		int operant;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First number: ");
		number1 = scanner.nextDouble();
		System.out.println("Enter Second number: ");
		number2 = scanner.nextDouble();

		System.out.println("Enter Choice");
		System.out.println("1 for add. \n" + "2 for subtract. \n" + "3 for multiply. \n" + "4 for divide. \n");
		operant = scanner.nextInt();

		switch (operant) {
		case 1:
			System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
			break;
		case 2:
			System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
			break;
		case 3:
			result = (number1 * number2);
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;
		case 4:
			try {
				result = number1 / number2;
				System.out.println(number1 + " / " + number2 + " = " + result);
				break;
			} catch (ArithmeticException e) {
				System.out.println("Invalid Division  " + e);
			}

		}

	}

}
