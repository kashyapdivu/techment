package com.logicbuilding;

import java.util.Random;
import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) {
		int randomNumber1, randomNumber2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess the Number between 1 to 20: ");
		int guessNumber = scanner.nextInt();

		Random randomObj = new Random();
		randomNumber1 = randomObj.nextInt(20);
		
		System.out.println(randomNumber1);
		
		if (randomNumber1 == guessNumber)
			System.out.println("The Random numbers were the same.");
		else
			System.out.println("The Random Numbers were different. ");

	}

}
