package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.entities.Employee;
import com.app.entities.FullTimeEmp;
import com.app.entities.PartTimeEmp;
import com.app.exception.CustomException;
import com.app.validation.EmployeeValidation;

import static com.app.validation.EmployeeValidation.validateInput;

public class EmployeeUtility {

	// Name, Date of joining, Phone Number, Aadhaar number
	// method to add emp(full time)
	public static FullTimeEmp addFullTimeEmp(String name, String dob, String phNo, String aadhar, double monthlySal,
			List<Employee> empList) throws CustomException {
		// System.out.println("validated");
		validateInput(name, dob, phNo, aadhar, empList);

		FullTimeEmp f1 = new FullTimeEmp(name, LocalDate.parse(dob), phNo, aadhar, monthlySal);
		empList.add(f1);
		return f1;
	}

	public static PartTimeEmp addPartTimeEmp(String name, String dob, String phNo, String aadhar, double hourlypay,
			List<Employee> empList) throws CustomException {
		validateInput(name, dob, phNo, aadhar, empList);
		PartTimeEmp f2 = new PartTimeEmp(name, LocalDate.parse(dob), phNo, aadhar, hourlypay);
		empList.add(f2);
		return f2;
	}

}
