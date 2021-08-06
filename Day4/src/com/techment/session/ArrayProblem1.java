package com.techment.session;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem1 {
	
	  public static void main(String[] args) {
		  int check =0;
		  
    	 Scanner scan = new Scanner(System.in);
		System.out.println("How many marks you want to enter : ");
		int marks = scan.nextInt();
		int markValue[] = new int[marks];
		System.out.println("Enter Marks ");
		for(int i =0 ; i< marks ; i++) {
			markValue[i] = scan.nextInt();
		}
		
		for(int i =0 ; i< markValue.length ; i++) {
			int j =i+1;
			System.out.println("Marks"+ j + " = "+ markValue[i]);
			
		}
		int totalMarks = 0;
		for(int i =0 ; i< markValue.length ; i++) {
			
			totalMarks += markValue[i];
			
		}
		System.out.println("Total Marks = "+ totalMarks );
		
		
		Arrays.sort(markValue); //sort the array
		System.out.println("Lowest Marks : "+ markValue[0]);
		System.out.println("Highest Marks : "+ markValue[marks-1]);
		
		System.out.println("2nd Highest Marks : "+ markValue[marks-2]);
		
		
        for(int i =0 ; i< markValue.length ; i++) {
			if(markValue[i]< 40) {
				 check = 0;
			      break;
			}
			else
				check++;
		}
        if(check > 0)
		    System.out.println("Pass");
        else
        	System.out.println("Fail");
	}
}
