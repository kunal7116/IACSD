package com.app.sortdob;

import java.util.Comparator;

import com.app.customer.Customer;

public class CustomerDobLnameComparator implements Comparator<Customer> 
{
	@Override
	//CUSTOM ORDERING
	public int compare(Customer c1, Customer c2) {
		int retVal = c1.getDob().compareTo(c2.getDob());
		//It will 1st compare the dob if it matches then it will check for lastname
		if(retVal==0) {
			return c1.getLast_name().compareTo(c2.getLast_name());
		}
		return retVal;
	}
}
