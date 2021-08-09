package com.logicbuilding;

import java.util.Scanner;

public class Exercise39 {

	public static void main(String[] args) {
		   int row,col;
           
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the number of rows: ");
           row = scan.nextInt();
           
           System.out.println("Enter the number of columns: ");
           col = scan.nextInt();
           
           int matrix1[][] = new int[row][col];
           int matrix2[][] = new int[row][col];
           int result[][] = new  int[row][col];
          
           System.out.println("Enter the Matrix1");
           for(int i =0; i<row ; i++) {
           	for(int j =0 ; j<col ;j++) {
           		matrix1[i][j] = scan.nextInt();
           	}
           	System.out.println();
           }
           
           System.out.println("Enter the Matrix2");
           for(int i =0; i<row ; i++) {
           	for(int j =0 ; j<col ;j++) {
           		matrix2[i][j] = scan.nextInt();
           	}
           	System.out.println();
           }
           

           //adding 2 matrix
           for(int i =0; i<row ; i++) {
           	for(int j =0 ; j<col ;j++) {
           		result[i][j] = matrix1[i][j] + matrix2[i][j];
           	}
           	System.out.println();
           }
         
           System.out.println("Sum of Matrixes ");
           for(int i =0; i<row ; i++) {
           	for(int j =0 ; j<col ;j++) {
           		System.out.print(result[i][j] +"\t");
           	}
           	System.out.println();
           }
	}




	}


