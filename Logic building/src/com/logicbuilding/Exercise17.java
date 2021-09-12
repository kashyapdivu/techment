package com.logicbuilding;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) throws InvalidAgeException {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age = in.nextInt();
		try {
			if (age >= 18)
				System.out.println("Welcome to vote");
			else
				throw new InvalidAgeException("InvalidAgeException");

		} catch (Exception e) {
			System.out.println("NOT ELIGIBLE TO VOTE" );
		}
	}

}

class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
		System.out.println("INVALIDAGEEXCEPTION ");
	}
}