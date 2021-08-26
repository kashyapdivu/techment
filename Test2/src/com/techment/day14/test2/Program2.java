package com.techment.day14.test2;

class Program2 {
public String repeatEnd(String str, int n)
{
		
    int len = str.length();
	String newString = "";
	for (int i = 0; i < n; i++) 
	{
		  newString += str.substring(len - n, len);
		
	}
	return newString;
}
	
	public static void main(String[] args)
    {
		     Program2 program2= new Program2();
		      String str1 =  "Hello";
		      System.out.println("String is: "+str1);
		      System.out.println("New string is: "+program2.repeatEnd(str1,3));
		      System.out.println("New string is: "+program2.repeatEnd(str1,2));
		      System.out.println("New string is: "+program2.repeatEnd(str1,1));
		      
	 } 
		  

}