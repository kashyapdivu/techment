package com.logicbuilding;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		// enter array1 size
		System.out.println("Enter the size of array: ");
		int size = scan.nextInt();
		System.out.println("Enter first array Element:");
		int[] arrValue1 = new int[size];
		// user input array1 element..
		for (int i = 0; i < size; i++) {
			arrValue1[i] = scan.nextInt();
		}

		// user input array2 element..
		System.out.println("Enter Second array Element:");
		int[] arrValue2 = new int[size];
		for (int i = 0; i < size; i++) {
			arrValue2[i] = scan.nextInt();
		}

		for (int i = 0; i < size; i++) {
			if (arrValue1[i] != arrValue2[i]) {
				count = 0;
				break;
			} else
				count++;
		}

		if (count == 0)
			System.out.println("Different");
		else
			System.out.println("Same");

	}

}
