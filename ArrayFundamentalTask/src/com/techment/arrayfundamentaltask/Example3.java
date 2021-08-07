
package com.techment.arrayfundamentaltask;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {


		public static void main(String[] args) {
			
		 Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 10 array Element:");
		int[] arrValue = new int[10];
		for(int i =0 ;i<10 ; i++) {
			arrValue[i] = scan.nextInt();
			
		}
		
		 Arrays.sort(arrValue); 
		 
		System.out.println("Element of array in Ascending order:");
		for(int i =0 ;i<arrValue.length ; i++) {
			System.out.print( arrValue[i]+ "\t");
		}
	
		}
}