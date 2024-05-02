package com.app.custval;

import java.time.LocalDate;
import java.util.List;

import com.app.customer.Customer;
import com.app.customer.ServicePlan;
import com.app.custexception.CustException;

public class CustomerValidation {

	public static Customer validateInputs(String first_name, String last_name, String email,
			String password, double reg_amt, String dob, String s_plan, List<Customer> customer) throws CustException {
		// 1.Check for Dup
		CheckForDup(email, customer);
		// 2.Parse
		ServicePlan splan = parseAndValidateSplan(s_plan, reg_amt);
		LocalDate birthdate = LocalDate.parse(dob);
		// All inputs are valid!
		//3.validate email
		ValidateEmail(email);
		return new Customer(first_name, last_name, email, password, reg_amt, birthdate, splan);
	}
	// validation for enumtype and its charges
	public static ServicePlan parseAndValidateSplan(String s_plan, double reg_amt) throws CustException {
		ServicePlan splan = ServicePlan.valueOf(s_plan.toUpperCase());
		// Plan is valid now check for reg_amt
		if (splan.getCharges() == reg_amt) {
			return splan;
		}
		throw new CustException("Reg amount doesnot match with service plan");
	}

	public static LocalDate parseDate(String dob) {
		return LocalDate.parse(dob);
	}

//	public static Customer CheckForDup(String email,Customer[] customer) throws CustException{
//		Customer cust = new Customer(email);
//		for(Customer c:customer) {
//			if(c!=null&&c.equals(cust)) {
//				System.out.println("check");
//				return c;
//			}
//		}
//		throw new CustException("Customer Data Already Exists!");

	public static void CheckForDup(String email, List<Customer> customerList) throws CustException {
		Customer newCust = new Customer(email);
		if (customerList.contains(newCust))
			throw new CustException("Dup Email!!");

	}
	
	public static void ValidateEmail(String email) {
		Customer newCust=new Customer(email);
	
	}
}
