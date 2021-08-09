package com.logicbuilding;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int number = scan.nextInt();
		int i, j, k;

		for (i = 1; i <= number; i++) {

			for (j = 1; j <= number - i; j++) {
				System.out.printf("  ");
			}
			for (j = i; j > 0; j--) {
				System.out.printf(" %d", j);
			}
			for (j = 2; j <= i; j++) {
				System.out.printf(" %d", j);
			}

			System.out.println();
		}
	}

}
