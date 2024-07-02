package com.app.validation;

import java.time.LocalDate;
import java.util.List;

import com.app.entities.Employee;
import com.app.entities.PartTimeEmp;
import com.app.exception.CustomException;

public class EmployeeValidation {

	// Name, Date of joining, Phone Number, Aadhaar number 
	public static Employee validateInput(String name,String doj,String pNo,String aadharNo,List<Employee> empList ) throws CustomException {
		//1. validate date
		LocalDate dateOfJoin = LocalDate.parse(doj);
		//2.validate phoneNum
		String phoneNo = validatePhoneNo(pNo);
		//3.validate aadhar
		String aadhar = validateAadhar(aadharNo);
		//4.checking duplicate addhar
		aadharDuplicate(aadharNo,empList);
		return new Employee(name,dateOfJoin,phoneNo,aadhar);
	}

	private static void aadharDuplicate(String aadharNo, List<Employee> empList) throws CustomException {
		Employee e1 = new Employee(aadharNo);
		if(empList.contains(e1)) {
			throw new CustomException("Aadhar number already exists");
		}
		
	}

	public static String validateAadhar(String aadharNo)throws CustomException {
		if(aadharNo.length() == 12 && aadharNo.matches("^\\d{12}$")) {
			return aadharNo;
		}
		throw new CustomException("Not a valid aadhar card num") ;
	}

	public static String validatePhoneNo(String pNo) throws CustomException {
		if(pNo.matches("^[0-9]*$")) {
			return pNo;
		}
		throw new CustomException("Phone Number is not valid");
	}
}
