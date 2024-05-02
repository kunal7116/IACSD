package com.app.customer;

import java.time.LocalDate;

public class Customer implements Comparable<Customer>{

	private int cust_id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private double reg_amt;
	private LocalDate dob;
	private ServicePlan s_plan;
	private static int idGenerator;

	public Customer(String first_name, String last_name, String email, String password, double reg_amt,
			LocalDate birthdate, ServicePlan type) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.reg_amt = reg_amt;
		this.dob = birthdate;
		this.s_plan = type;
		this.cust_id = ++idGenerator;
	}

	// add overloaded constructor to wrap PK(email)
	public Customer(String email) {
		super();
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	
	public LocalDate getDob() {
		return dob;
	}

	public String getLast_name() {
		return last_name;
	}

	@Override
	public boolean equals(Object o) {
    //System.out.println("Checking Login Creditnals...");
		if (o instanceof Customer) {
			Customer c = (Customer) o;
			return this.email.equals(c.email);
		}
		return false;
	}
	
	public int compareTo(Customer cust){
		//Its Natural Ordering thats why we dont have to create a new class we have to write it within the customer
	return getEmail().compareTo(cust.email);
	}
	
	
	public String toString() {
		return "Customer Id:" + this.cust_id + " First Name:" + this.first_name + " Last Name:" + this.last_name
				+ " Email:" + this.email + " Registrartion Amount:" + this.reg_amt + " DOB-" + this.dob
				+ " Service Plan:" + this.s_plan;
	}

	
		

	

}
