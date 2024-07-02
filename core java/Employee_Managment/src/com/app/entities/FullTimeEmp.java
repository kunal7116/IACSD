package com.app.entities;

import java.time.LocalDate;

public class FullTimeEmp extends Employee {
	private double monthlySal;

	// parametrized constructor
	public FullTimeEmp(String name, LocalDate doj, String phoneNo, String adhaarNum, double monthlySal) {
		super(name, doj, phoneNo, adhaarNum);
//		setIdGenerator(getIdGenerator()-1);
		this.monthlySal = monthlySal;
		super.setEmpId(getEmpId()/2);
	}

	// GETTER & SETTER
	public double getMonthlySal() {
		return monthlySal;
	}

	public void setMonthlySal(double monthlySal) {
		this.monthlySal = monthlySal;
	}

	// ToString
	@Override
	public String toString() {
		return "FullTimeEmp{" + super.toString()+", " +
                "monthlySalary=" + monthlySal+
                '}';
	}

}
