package com.app.sortdob;

import java.util.Comparator;

import com.app.customer.Customer;

public class CustomerDobLnameComparator implements Comparator<Customer> 
{
	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		int retVal = c1.getDob().compareTo(c2.getDob());
		if(retVal==0) {
			return c1.getLast_name().compareTo(c2.getLast_name());
		}
		return retVal;
	}
}
