package com.techment.arrayfundamentaltask;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		
           Scanner scan = new Scanner(System.in);
	System.out.println("Enter How much element your want: ");
	int arrSize = scan.nextInt();
	
	System.out.println("Enter array Element:");
	int[] arrValue = new int[arrSize];
	for(int i =0 ;i<arrValue.length ; i++) {
		arrValue[i] = scan.nextInt();
		
	}
	
	System.out.println("Array Element:");
	for(int i =0 ;i<arrValue.length ; i++) {
		System.out.print( arrValue[i]+"\t");
		
	}
	
	 Arrays.sort(arrValue);
 
	 System.out.println("\nLargest 2 numbers are : "+ arrValue[arrValue.length-1]+", "+ arrValue[arrValue.length-2] );
	
	 System.out.println("Smallest 2 numbers are : "+ arrValue[0]+", "+ arrValue[1]);
	
	}

}
