package com.logicbuilding;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		int horse1, horse2, horse3, largest;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first horse weight:");
		horse1 = scanner.nextInt();
		System.out.println("Enter the second horse weight:");
		horse2 = scanner.nextInt();
		System.out.println("Enter the third horse weight:");
		horse3 = scanner.nextInt();

		if (horse1 == horse2 || horse2 == horse3 || horse3 == horse1) {
			System.out.println("Entered weights are not distinct value. ");

		} else {
			largest = horse3 > (horse1 > horse2 ? horse1 : horse2) ? horse3 : ((horse1 > horse2) ? horse1 : horse2);
			System.out.println("The largest weight  is: " + largest);

		}

	}

}
