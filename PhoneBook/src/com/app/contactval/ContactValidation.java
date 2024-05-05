package com.app.contactval;

import java.time.LocalDate;
import java.util.HashSet;

import com.app.contact.Contact;
import com.app.contactexception.ContactException;

public class ContactValidation {
	
	public static Contact validateInputs(String phNo,String name,String dob,String email,HashSet<Contact> contactList) throws ContactException {
		//1.validating phone number
		String vphno = valPhoneNum(phNo);
		//2.validating Email
		String vemail=valEmail(email);
		//3.Parsing of Date
		LocalDate birthDate = LocalDate.parse(dob);
		return new Contact(vphno,name,birthDate,vemail);
	}

	public static LocalDate parsedate(String dob) {
		return LocalDate.parse(dob);
	}
	
	public static String valEmail(String email) throws ContactException {
		//API of string:str.matches to check whether the email is matching with given condition
		String str = "\\w+@[a-zA-Z]+\\.(org|com|net)$";
		if(email.matches(str)) {
			return email;
		}
		throw new ContactException("Not an valid email!!");
	}
	
	public static String valPhoneNum(String phNo) throws ContactException {
		//API of string:str.matches to check whether the phone Number is matching with given condition
		String str = "^[+]{1}(?:[0-9\\-\\(\\)\\/"+"\\.]\\s?){10,11}[0-9]{1}$";
		if(phNo.matches(str)) {
			return phNo;
		}
		throw new ContactException("Not a valid Phone Number!!");
	}
}
