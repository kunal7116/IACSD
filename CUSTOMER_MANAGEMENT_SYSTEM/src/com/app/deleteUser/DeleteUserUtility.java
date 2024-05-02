package com.app.deleteUser;

import java.util.List;

import com.app.custexception.CustException;
import com.app.customer.Customer;

public class DeleteUserUtility {

	public static String DeleteUser(String email, List<Customer> customerList) throws CustException {
		Customer cust = new Customer(email);
		//Find the index of email that user entered
		int index = customerList.indexOf(cust);
		//if the email is presented in data then removing that index data
		if (index != -1 && customerList.contains(cust)) {
			customerList.remove(index);
			return "Customer is deleted!!";
		} 
			throw new CustException("Invalid Email");
		
	}
}