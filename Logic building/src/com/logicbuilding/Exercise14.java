package com.logicbuilding;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Products :");
		int size = scan.nextInt();
		System.out.println("Enter Product quantity:");
		int[] arrValue1 = new int[size];
		int sum = 0;
		// user input array1 element..
		for (int i = 0; i < arrValue1.length; i++) {
			arrValue1[i] = scan.nextInt();
		}

		for (int i = 0; i < arrValue1.length; i++) {
			sum += arrValue1[i];
		}
		System.out.println("Total product: " + sum);

	}

}
