package com.app.entities;

import java.time.LocalDate;

public class PartTimeEmp extends Employee{
	
	private double hourlyPayment;
	
	//parameterized constructor
	public PartTimeEmp(String name, LocalDate doj, String phoneNo, String adhaarNum, double hourlyPayment) {
		super(name, doj, phoneNo, adhaarNum);
		this.hourlyPayment=hourlyPayment;
		super.setEmpId(getEmpId()/2);
	}

	//getter & setter
	public double getHourlyPayment() {
		return hourlyPayment;
	}

	public void setHourlyPayment(double hourlyPayment) {
		this.hourlyPayment = hourlyPayment;
	}

	//ToString
	@Override
	public String toString() {
		return "PartTimeEmp ["+super.toString()+"hourlyPayment=" + hourlyPayment + "]";
	}
	
	
	
	

	
	
}
