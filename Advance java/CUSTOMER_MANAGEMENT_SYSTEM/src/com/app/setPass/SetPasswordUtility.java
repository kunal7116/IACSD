package com.app.setPass;

import java.util.List;

import com.app.customer.Customer;
import com.app.custexception.CustException;

public class SetPasswordUtility {

	public static String ChangePass(String email, String pass, String newpass, List<Customer> customerList)
			throws CustException {
		Customer cust = new Customer(email);
		int index = customerList.indexOf(cust);
		if (index != -1 && customerList.get(index).getPassword().equals(pass)) {
			// Customer updatecust = new Customer(newpass);
			customerList.get(index).setPassword(newpass);
			// customerList.get(index).set(index, updatecust);
			return "Password Changed Successfully...";
		}
		throw new CustException("Password not Changed!!");
	}
}
