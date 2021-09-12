package com.logicbuilding;

import java.util.Scanner;

public class Exercise20 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the size of Array: ");
			int arrSize = scan.nextInt();

			int arr[] = new int[arrSize];

			System.out.println("Enter the Array Element");
			for (int i = 0; i < arrSize; i++) {
				arr[i] = scan.nextInt();
			}

			System.out.println("Array");
			for (int i = 0; i < arrSize; i++) {
				System.out.print(arr[i] + "  ");
			}

			System.out.println("\nEnter the index want to search: ");
			int findIndex = scan.nextInt();

			System.out.println("Item at index " + findIndex + " is " + arr[findIndex]); // find item at intex if not
																						// found go to catch block

		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Exception: " );
		}
	}

}
