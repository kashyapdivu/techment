package com.logicbuilding;

import java.util.Scanner;

public class Exercise35 {

	public static void main(String[] args) {
		
		
		   // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:  ");

        int rows = scanner.nextInt();
       

        for (int i=1; i<=rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
        for (int i=1; i<=rows-1; i++) 
        { 
            // Print star in decreasing order 
            for (int j = 1; j <=rows-i; j++)
            {
                System.out.print(j);
            }
            // Print space in increasing order
            for (int k = 1; k < i; k++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        scanner.close();
    }
}
		
		
		
		