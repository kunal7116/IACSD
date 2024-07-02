package com.app.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {	
	
	//Data Member
	// Name, Date of joining, Phone Number, Aadhaar number 
	private int empId;
	private String name;
	private LocalDate doj;
	private String phoneNo;
	private String adhaarNum;
	private static int idGenerator;
	
	
	//parameterized constructor
	public Employee(String name, LocalDate doj, String phoneNo, String adhaarNum) {
		super();
		this.empId=++idGenerator;
		this.name = name;
		this.doj = doj;
		this.phoneNo = phoneNo;
		this.adhaarNum = adhaarNum;
	}

	public Employee(String aadharNo) {
		this.adhaarNum=aadharNo;
	}

	//getter & setter
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getDoj() {
		return doj;
	}


	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getAdhaarNum() {
		return adhaarNum;
	}


	public void setAdhaarNum(String adhaarNum) {
		this.adhaarNum = adhaarNum;
	}


	public static int getIdGenerator() {
		return idGenerator;
	}


	public static void setIdGenerator(int idGenerator) {
		Employee.idGenerator = idGenerator;
	}
	
	//Tostring
	@Override
	public String toString() {
		return "Employee empId=" + empId + ", name=" + name + ", doj=" + doj + ", phoneNo=" + phoneNo + ", adhaarNum="
				+ adhaarNum+",";
	}

	//equal Override
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		return Objects.equals(adhaarNum, other.adhaarNum);
	}
	
	
	
	
	
	
	
	
}
