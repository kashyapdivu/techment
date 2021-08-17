package com.techment.assignment1.oops;

class Address{
	  private String addressLine ;
	  private String city;
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	  
	
	 public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	String getAddressDetails() {
		return getAddressLine()+", "+getCity();
	 }
	  
}

//class customer
class Customer{
	
	 private String customerName ;
	 Address  residentialAddress ;  //HAS –A relation
	
	 //default constructor
	 public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	 //parameterized constructor
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}


	
	
	 public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	//method 
	String getCustomerDetails(){
		return "Customer : "+customerName+"\n"+
	             "Residential Address : "+ residentialAddress.getAddressDetails()+"\n";
	
	 }	 
	
}


//main class
public class TestCustomer {

	public static void main(String[] args) {

		System.out.println("By default Constructor...");
		//an object of Customer with default constructor.
       Customer customer1 =  new Customer();
       Address address1 = new Address();
		
       // Use setters to assign values to the member variables.
       customer1.setCustomerName("John");
       address1.setAddressLine("Ist Main HSR Layout");
       address1.setCity("Bangalore");
       //Display the values of member variables using getters.
		System.out.println( "Customer : "+customer1.getCustomerName());
		System.out.println( "Residental Address : "+address1.getAddressLine()+", "+address1.getCity());
      
  	
		System.out.println("\n\nBy Parameterized Constructor...");
		//an object of Customer with parameterized constructor.
       Address address2 = new Address("Streeet 3 Anand Nagar","Raipur");
		Customer customer2 =  new Customer("Namrata" ,address2);
       System.out.println(customer2.getCustomerDetails());
		
	}

}
