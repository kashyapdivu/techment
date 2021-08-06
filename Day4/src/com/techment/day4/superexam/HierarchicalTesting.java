package com.techment.day4.superexam;
 
class Student{
	void msg() {
		System.out.println("Student details");
	}
}

class Engineering extends Student{
	void engMsg() {
		System.out.println("Engineering Student.");
	}
}

class Medical extends Student{
	void medMsg() {
		System.out.println("Medical Student ");
	}
}


public class HierarchicalTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineering eng = new Engineering();
        eng.msg();  
		eng.engMsg();
	}

}
