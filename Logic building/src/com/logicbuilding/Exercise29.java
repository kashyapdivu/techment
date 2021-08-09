package com.logicbuilding;

import java.util.Scanner;

//Program to accept 3 sides of a tringle and display if the tringle is a right angle tringle or not.
public class Exercise29 {

	public static void main(String[] args) {
		int side1, side2, side3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 sides of a Triangle: ");
		side1 = scanner.nextInt();
		side2 = scanner.nextInt();
		side3 = scanner.nextInt();

		int sqOfSide1 = side1 * side1;
		int sqOfSide2 = side2 * side2;
		int sqOfSide3 = side3 * side3;

		if (sqOfSide1 == sqOfSide2 + sqOfSide3 || sqOfSide2 == sqOfSide3 + sqOfSide1
				|| sqOfSide3 == sqOfSide1 + sqOfSide2) {
              System.out.println("Right angle Triangle.");
		} else
			System.out.println("Not Right angle Triangle. ");
	}

}
