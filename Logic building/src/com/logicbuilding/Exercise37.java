package com.logicbuilding;

import java.util.Scanner;

public class Exercise37 {

	public static void main(String[] args) {
		 
	   Scanner scan=new Scanner(System.in);
		//create a scanner object for input
		System.out.print("Enter the number of rows: ");
		int rows=scan.nextInt();//reads rows from user
		for(int i=1; i<=rows; i++){    //print upper part
		    for(int j=1; j<=rows-i; j++){
		      System.out.print(" ");//print space
		}
		for(int k=i; k>=1; k--){
		      System.out.print(k);
		}
		for(int l=2; l<=i; l++){
		      System.out.print(l);
		}
		System.out.println();//move to next line
		}
		for(int i=rows-1; i>=1; i--){  //print lower part
		    for(int j=0; j<=rows-1-i; j++){
		      System.out.print(" ");//print space
		}
		for(int k=i; k>=1; k--){
		      System.out.print(k);
		}
		for(int l=2; l<=i; l++){
		      System.out.print(l);
		}
		System.out.println();//move to next line
		        }
		    }
		}