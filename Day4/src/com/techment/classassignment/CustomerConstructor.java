package com.techment.classassignment;

class Customer{
	 int id,contact,minBalance;
	 String name;
	 
	  Customer(int cusId ,int cusContact , int cusMinBalance , String cusName){
		  id = cusId;
		  contact = cusContact;
		  minBalance =cusMinBalance;
		  name = cusName;
	  }

	 
	  
	  public void CustomerDetails() {
		  System.out.println("Customer Details\n"
		  		+ "Id: "+id+ "\nName: "+name+ "\nContact: "+contact+"\nMin Balance : "+minBalance);
	  }
	  
	  public String checkAccountStatus() {
		if(minBalance == 0)
		   return "Zero Balance Account";
		else if(minBalance == 1000  )
			return "Saving  Account";
		else if(minBalance == 10000)
			return "Current Account";
		return "Invalid";
	 }
}

public  class CustomerConstructor {
	  
     public static void main(String[] args) {
    	  Customer customer1 =new Customer(1,707070707, 3000,"XYZ");
    	  Customer customer2 =new Customer(2,808080707, 30000,"ABC");
    	  Customer customer3 =new Customer(3,99990707, 70000,"Customer3");
    	  
    	  customer1.CustomerDetails();
    	  System.out.println(customer1.checkAccountStatus());
    	  
    	  customer2.CustomerDetails();
    	  System.out.println(customer2.checkAccountStatus());
    	  
    	  customer3.CustomerDetails();
    	  System.out.println(customer3.checkAccountStatus());
    	  
	}
}

