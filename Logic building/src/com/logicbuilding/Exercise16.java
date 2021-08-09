package com.logicbuilding;

import java.util.Scanner;

// Program to accept a number and display it it is divisible by both 8 and 3
public class Exercise16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Price : ");
		int price = scanner.nextInt();

		if (price % 3 == 0 && price % 8 == 0)
			System.out.println("Price is divisible by both 3 & 8.");
		else
			System.out.println("Price is not divisible by 3 & 8");

	}

}
