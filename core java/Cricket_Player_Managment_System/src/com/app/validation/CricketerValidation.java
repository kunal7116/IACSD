package com.app.validation;

import java.util.List;

import com.app.entities.Cricketer;
import com.app.entities.Speciality;
import com.app.exception.CustomException;

public class CricketerValidation {
	
	//String name,int age,String email_id,String Phone,int rating


	public static Cricketer validateAllInputs(String name,int age,String email,
			String phone, int rating, String sp,List<Cricketer> list) throws CustomException {
		emailDuplication(email,list);	
		ratingNotGreaterThanFive(rating);
		SpecialityPresent(sp);
		Speciality  sp1 = validateSpeciality(sp);
		return new Cricketer(name,age,email,phone,rating,sp1);
		
	}
	
	
	private static Speciality SpecialityPresent(String sp) throws CustomException{
		for (Speciality s : Speciality.values()) {
			if(s.name().equalsIgnoreCase(sp)) {
				return s;
			}
		}
		throw new CustomException("No such speciality exists");
		
	}


	private static Speciality validateSpeciality(String sp) {
		Speciality sp1 = Speciality.valueOf(sp.toUpperCase());
		return sp1;
	}


	public static Cricketer emailDuplication(String email,List<Cricketer> list) throws CustomException{
		Cricketer c = new Cricketer(email);
		if(list.contains(c)) {
			System.out.println("abc");
			throw new CustomException("Email id already exists");
		}
		return c;
	}
	
	public static void ratingNotGreaterThanFive(int rating)  throws  CustomException{
		if(rating>5) {
			throw new CustomException("Rating cannot be greater than 5");
		}
	}


	
}
