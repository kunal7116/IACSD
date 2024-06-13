package com.app.login;

import com.app.customer.Customer;

import java.util.List;

import com.app.custexception.CustException;

public class LoginUtility {

	@SuppressWarnings("unlikely-arg-type")
	public static Customer VerifyLogin(String email, String password, List<Customer> customerList)
			throws CustException {
		Customer cust = new Customer(email);
		// finding the index of email entered by user
		int index = customerList.indexOf(cust);
		// if the index is found then check whether the pass user enter is matching the
		// pass exist in data
		// we will get the pass already existing using getter for pass
		if (index != -1 && customerList.get(index).getPassword().equals(password)) {
			return customerList.get(index);
		}
		throw new CustException("Invalid email and password");
	}	
}
