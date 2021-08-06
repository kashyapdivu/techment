package com.techment.day4.superexam;
import com.techment.classassignment.AccessSpecifierEx2;
import com.techment.classassignment.CustomerConstructor;


 class A{
	 int a ;
	 
	 private A() {
		 a= 10;
	 }
	 
	 void amethod() {
		System.out.println("hello " + a);
	}
}

 class AccessModifierEx extends AccessSpecifierEx2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierEx aObj = new AccessModifierEx(); //default constructor  obj
	
//		
		AccessModifierEx aObj2 = new AccessModifierEx();
		aObj2.msg(55);
		//Customer cus = new Customer();
		
	}

}
