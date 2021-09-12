package com.logicbuilding;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {
		System.out.println("Enter size: ");
		Scanner scan  = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		for (int i = size; i >= 1; i--)
        {
            for (int j = size - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}