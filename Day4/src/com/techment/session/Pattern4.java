package com.techment.session;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 3,sum=1;
		for(int i = 1; i<=row;++i) {
			   for(int j =1; j<=i;++j) {
				    System.out.print(sum+" ");
				    sum = sum +1;
		   }
		   System.out.println();
	    }
	}

}
