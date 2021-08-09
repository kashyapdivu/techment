package com.logicbuilding;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  Program to Sort Words of Sentense
 */

public class Exercise43 {

	public static void main(String[] args) {
		String sentence;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		sentence = scanner.nextLine();
		String[] splitSentence = sentence.split(" ");
		Arrays.sort(splitSentence);
		
		for(String element : splitSentence) {
			System.out.println(element);
		}
	}

}
