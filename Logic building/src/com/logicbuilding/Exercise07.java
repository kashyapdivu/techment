package com.logicbuilding;

import java.util.Scanner;

public class Exercise07 {
  
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st Soldier number: ");
		int num1 = scan.nextInt();
		System.out.print("Enter last Soldier number: ");
		int num2 = scan.nextInt();

		System.out.println("Soldier who are going for battle : ");
		for(int i = num1;i<=num2;i++)
			System.out.println("Soldier "+i);
	}
	
}
