package com.logicbuilding;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = in.nextInt();
		System.out.println("Table of " + num + "\n");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
