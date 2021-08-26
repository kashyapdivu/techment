package com.techment.day14.test2;

public class Program1 {

		public String repeatFront(String str, int n) 
			{
			  int l = str.length();
			  String newstring = "";
			  for (int i = n; n > 0; n--)
			  {
			    newstring += str.substring(0,n);
			  }
			  return newstring;
			}

			public static void main (String[] args)
			    {
				Program1 m= new Program1();
			      String str1 =  "Chocolate";
			      System.out.println("first string is: "+str1);
			      System.out.println("New string is: "+m.repeatFront(str1,4));
			      System.out.println("New string is: "+m.repeatFront(str1,3));
			      
			      String str2 =  "IceCream";
			      System.out.println("second string is: "+str2);
			      System.out.println("New string is: "+m.repeatFront(str2,2));
				}
		}
	

