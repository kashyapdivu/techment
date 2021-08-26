package com.techment.assignment1.oops;


class Address1{
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
	public Address1(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	  
	
	
	@Override
	public String toString() {
		return "Address1 [addressLine=" + addressLine + ", city=" + city + "]";
	}
	
	String getAddressDetails() {
		return getAddressLine()+", "+getCity();
	 }
	  
}

//class customer
class Customer1{
	
	 private String customerName ;
	 Address1  residentialAddress ;  //HAS –A relation
	  Address1 officialAddress ;
	 

	public Customer1(String customerName2, Address1 resAddress, Address1 officeAddress) {
		super();
		this.customerName = customerName2;
		this.residentialAddress = resAddress;
		this.officialAddress = officeAddress;
	}
	
	
	
	public String getCustomerName() {
		return customerName;
	}

    public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

     public Address1 getResidentialAddress() {
		return residentialAddress;
	}
   
     public void setResidentialAddress(Address1 residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public Address1 getOfficialAddress() {
		return officialAddress;
	}
  public void setOfficialAddress(Address1 officialAddress) {
		this.officialAddress = officialAddress;
	}


	//method 
	String getCustomerDetails(){
		return "Customer : "+customerName+"\n"+
	             "Residential Address : "+ residentialAddress.getAddressDetails()+"\n"+
	             "Official Address : "+ officialAddress.getAddressDetails()+"\n";
	
	 }	
	
	
}


public class Program4 {

	public static void main(String[] args) {
		
		Address1 resAddress = new Address1("Streeet 3 Anand Nagar","Raipur");
		Address1 officeAddress = new Address1("Ist Main Electronics city","Bangalore");
		Customer1 customer =  new Customer1("John Carter" ,resAddress,officeAddress);
       System.out.println(customer.getCustomerDetails());
		
	}

}
