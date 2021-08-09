package com.logicbuilding;

import java.util.Scanner;

public class Exercise44 {

	public static void main(String[] args) {
		int side1, side2, side3;
		double area =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 sides of a Triangle: ");
		side1 = scanner.nextInt();
		side2 = scanner.nextInt();
		side3 = scanner.nextInt();
		
		double s = (side1+side2+side3)/2;
		
		area = Math.sqrt(s*(s-side1) * (s-side2) * (s- side3));

		System.out.println("Area of Triangle: "+ area);
	}

}
