package com.logicbuilding;

import java.util.Scanner;

public class T4_LeapYearEvent {

	public static void main(String[] args) {
		System.out.println("Enter Year : ");

		Scanner scanner = new Scanner(System.in);
		int yearValue = scanner.nextInt();
		System.out.println("Enter Year : ");

		if ((yearValue % 4 == 0) && (yearValue % 100 != 0) || (yearValue % 400 == 0)) {
			System.out.println(yearValue + " is leap year. ");
		} else
			System.out.println(yearValue + " is not leap year. ");
	}

}
