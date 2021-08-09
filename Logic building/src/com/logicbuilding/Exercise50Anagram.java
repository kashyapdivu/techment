package com.logicbuilding;

import java.util.Arrays;
import java.util.Scanner;

//Program to check 2 string are anagram or not.
public class Exercise50Anagram {

	public static void main(String[] args) {
		String input1, input2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String");
		// first string input
		input1 = scan.nextLine();
		System.out.println("Enter second String");
		input2 = scan.nextLine(); // first string input

		input1 = input1.replaceAll("\\s", "").toUpperCase();
		input2 = input2.replaceAll("\\s", "").toUpperCase();

		checkAnagram(input1, input2);

		// System.out.println(string1);
	}

	private static void checkAnagram(String input1, String input2) {
		int input1_length, input2_length;
		boolean result = false;

		input1_length = input1.length(); // assign the size of the string.
		input2_length = input2.length();
		;
		if (input1_length != input2_length)
			System.out.println("String are not Anagram");

		else {
			char[] string1 = input1.toCharArray(); // convert string into char array
			char[] string2 = input2.toCharArray();

			Arrays.sort(string1); // sorting the char array.
			Arrays.sort(string2);

			result = Arrays.equals(string1, string2); //equal method compare the each charindex.

			
			if (result)
				System.out.println("String are Anagram");
			else
				System.out.println("String are not Anagram");
		}
	}
}
