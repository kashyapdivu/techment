package com.techment.day5.car_enginetask;

public class AccountCustomerClass {

	public static void main(String[] args) {
		// customer1
		AccountClass accountObj1 = new AccountClass(101, 500, "Raipur Branch", "PUN12345");
		CustomerClass custObj1 = new CustomerClass(1, "XYZ", accountObj1);
		custObj1.customerDetails();
		System.out.println("*********Account Type*********** :" + accountObj1.checkAccountStatus()+"\n");

		// customer2
		AccountClass accountObj2 = new AccountClass(102, 30000, "Bhilai Branch", "PUN12347");
		CustomerClass custObj2 = new CustomerClass(2, "ABC", accountObj2);
		custObj2.customerDetails();
		System.out.println("*********Account Type*********** :" + accountObj2.checkAccountStatus() +"\n");

		// customer3
		AccountClass accountObj3 = new AccountClass(103, 800000, "Raipur Branch", "PUN12345");
		CustomerClass custObj3 = new CustomerClass(3, "OPQ", accountObj3);
		custObj3.customerDetails();
		System.out.println("*********Account Type*********** :" + accountObj3.checkAccountStatus());
	}

}
