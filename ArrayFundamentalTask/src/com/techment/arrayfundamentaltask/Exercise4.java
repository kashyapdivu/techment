package com.techment.arrayfundamentaltask;

import java.util.Scanner;

//Program to take 2 array input from user and merge the array1 and after that array2..
public class Exercise4 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 // enter array1 size
		 System.out.println("How many value want in Array 1: "); 
		 int limit1 = scan.nextInt();
			System.out.println("Enter first array Element:");
			int[] arrValue = new int[limit1];
			//user input array1 element..
			for(int i =0 ;i<arrValue.length ; i++) {
				arrValue[i] = scan.nextInt();
			}
			
			System.out.println("How many value want in Array 2: ");   // enter array2 size
			 int limit2 = scan.nextInt();
			//user input array2 element..
			System.out.println("Enter Second array Element:");
			int[] arrValue2 = new int[limit2];
			for(int i =0 ;i<arrValue2.length ; i++) {
				arrValue2[i] = scan.nextInt();
			}
			
			int arrSize1= arrValue.length;
			int arrSize2 =arrValue2.length;
			int resSize =arrSize1 + arrSize2; //sum of both array length
			//System.out.println("Merge array Size:" +resSize);
			
			System.out.println("Merge Array");
			
			int[] resultantArray = new int[resSize];  //defining the resultant array size...
		     //System.out.println(resultantArray.length);
		     
			//storing first array into resultant array
		     for(int i =0 ; i<arrSize1 ; i++) {
		    	  
		    	 resultantArray[i] += arrValue[i];
		    	 
		     }
		     
		   //merging second array into resultant array
		     for(int i =0 ; i<arrSize2 ; i++) {
		    	  
		    	 resultantArray[arrSize1+i] += arrValue2[i];
		    	 
		     }
		     
		     //print  resultant array
		     for(int i =0 ; i<resSize ; i++) {
		    	  
		    	 System.out.print( resultantArray[i]+"\t");
		    	 
		     }
	}

}
