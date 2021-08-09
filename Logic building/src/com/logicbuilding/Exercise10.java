package com.logicbuilding;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter limit upto you want prime number: ");
		int number = scan.nextInt();
		boolean first = true;

		if (number == 1)
			System.out.println("2");

		for (int i = 2; i < number; i++) {

			if (checkPrimeNumber(i)) {
				if (first == false)
					System.out.print(",");

				System.out.print(i);
				first = false;
			}
		}

	}

	public static boolean checkPrimeNumber(int num) {
		boolean status = true;

		for (int i = 2; i <= num / 2; ++i) {

			if (num % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}
}
