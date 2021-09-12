package com.logicbuilding;

import java.util.Scanner;

//Program to check whether enter number is armstrong or not... 
public class Exercise08ArmstrongNumber {

	public static void main(String[] args) {
		int num, temp, remainder, result = 0;
		System.out.println("Enter a Number: ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		temp = num;

		while (temp != 0) {
			remainder = temp % 10;
			result += Math.pow(remainder, 3);
			temp = temp / 10;
		}

		if (num == result) {
			System.out.println(num + " is Armstrong");

		} else
			System.out.println(num + " is not armstrong");

	}

}
