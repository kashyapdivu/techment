package com.logicbuilding;

import java.util.Scanner;

public class T5_MyBirthMonth {

	public static void main(String[] args) {
		System.out.println("Enter your birthday month number : ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		getMonthName(month);
	}

	private static void getMonthName(int month) {
		String monthName = " ";
		switch (month) {
		case 1:
			System.out.println("Your birthday is in January month.");
			break;
		case 2:
			System.out.println("Your birthday is in Febuary month.");
			break;
		case 3:
			System.out.println("Your birthday is in March month.");
			break;
		case 4:
			System.out.println("Your birthday is in April month.");
			break;
		case 5:
			System.out.println("Your birthday is in May month.");
			break;
		case 6:
			System.out.println("Your birthday is in June month.");
			break;
		case 7:
			System.out.println("Your birthday is in July month.");
			break;
		case 8:
			System.out.println("Your birthday is in August month");
			break;
		case 9:
			System.out.println("Your birthday is in September month");
			break;
		case 10:
			System.out.println("Your birthday is in October month");
			break;
		case 11:
			System.out.println("Your birthday is in November month");
			break;
		case 12:
			System.out.println("Your birthday is in December month");
			break;
		default:
			System.out.println("Invalid Month");

		}

	}

}
