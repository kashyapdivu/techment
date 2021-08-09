package com.logicbuilding;

import java.util.Scanner;

public class Exercise9 {
// Program to accept a number n and displaay the first n nu,ber from the series
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of series: ");
		int number = scan.nextInt();
		boolean firstValue = true;

		for (int i = 1; i <= number; i++) {
			if (firstValue == false)
				System.out.print(",");
			System.out.print(i * i * i);
			firstValue = false;
		}

	}

}
