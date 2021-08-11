package com.techment.day8.test;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		int child = 0, adult = 0, senior = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many person you want to enter : ");
		int limit = scan.nextInt();
		int age[] = new int[limit];
		System.out.println("Enter Age ");
		for (int i = 0; i < limit; i++) {
			age[i] = scan.nextInt();
		}

		for (int j = 0; j < limit; j++) {
			if (age[j] < 18)
				child++;
			else if (age[j] >= 18 && age[j] <= 54) {
				adult++;
			} else if (age[j] >= 55)
				senior++;
		}

		System.out.println("Children: " + child);
		System.out.println("Adult: " + adult);
		System.out.println("Senior Citizen: " + senior);

	}

}
