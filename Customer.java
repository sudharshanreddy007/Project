package homeAPP;

import java.util.*;
public class Customer
{

    /*Customer should know about his
    customerID ,customerName, contactNumber */

    int customerID;
	String customerName;
    String contactNumber;
    
    public int getCustomerID() { //applying getters and setters
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


    List <Product>bookedProductList;
    
    
    public Customer (int custID,String name,String contactNo) /*The Constructor creates Customer object 
                                                                  with the given id, name &
                                                                     contact no*/
    {
       customerID  = custID;
       customerName = name;
       contactNumber = contactNo;
       bookedProductList = new ArrayList<Product>();
    }
    
    
    public Customer() {
	
	}


	
    public void addBookedProduct(Product product)/*
                                                   Public void addBookedProduct(Product product) :
                                          The method adds the product which is booked by the customer to
                                                  his bookedProductList. */
    {
        bookedProductList.add(product);
    }
    
    
}