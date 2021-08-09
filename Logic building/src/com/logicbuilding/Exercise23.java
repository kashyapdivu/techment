package com.logicbuilding;

import java.util.Scanner;

public class Exercise23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Weight(in Kg) : ");
		double weight = scanner.nextDouble();

		System.out.println("Enter Height(in meters) : ");
		double height = scanner.nextDouble();

		double bmiCalculation = weight / (height * height);

		// String.format("%.20f", a); String.format() method to format the decimal
		// number to some specific format.
		System.out.println("Weight:  " + weight + "kg");
		System.out.println("Height:  " + height + "m");
		System.out.println("BMI:  " + String.format("%.3f", bmiCalculation));

		if (bmiCalculation < 18.5)
			System.out.println("Underweight");
		else if (bmiCalculation == 18.5 || bmiCalculation < 25)
			System.out.println("Normal");
		else if (bmiCalculation == 25 || bmiCalculation < 30)
			System.out.println("OverWeight");
		else if (bmiCalculation > 30)
			System.out.println("Obese");

	}

}
