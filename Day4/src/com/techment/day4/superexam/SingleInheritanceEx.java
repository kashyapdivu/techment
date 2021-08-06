package com.techment.day4.superexam;

class ParentSingleInher{
	void msg() {
		System.out.println("this is parent class..");
	}
}

class ChildSingleInher extends ParentSingleInher{
	void print() {
		System.out.println("this is child class..");
	}
}

public class SingleInheritanceEx {
	public static void main(String[] args) {
		ChildSingleInher obj = new ChildSingleInher();
		obj.msg();
		obj.print();
	}

}
