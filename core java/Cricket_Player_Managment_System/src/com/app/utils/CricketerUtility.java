package com.app.utils;

import java.util.List;

import com.app.entities.Cricketer;
import com.app.entities.Speciality;
import com.app.exception.CustomException;

public class CricketerUtility {
	
	public static void updateCricketerRating(String email,int rating,List<Cricketer>list) throws CustomException {
		for (Cricketer cricketer : list) {
			if(cricketer.getEmailId().equals(email)) {
				cricketer.setRating(rating);
			}
			else {
				throw new CustomException("No such email exists");
			}
		}
		
		
	}
	
	public static Cricketer searchByName(String name,List<Cricketer>list) throws CustomException{
		for (Cricketer cricketer : list) {
			if(cricketer!=null && cricketer.getName().equals(name)) {
				return cricketer;
			}
		}
		throw new CustomException("name not exists");	
	}
	
	
	public static void removeCricketerByName(String name, List<Cricketer>list) throws CustomException {
	
		boolean flag = list.removeIf(s->s.getName().equals(name));
		if(!flag) {
			throw new CustomException("No such name exists");
		}
	}

	public static void removeByEnum(Speciality sp,List<Cricketer>list) throws CustomException{
		boolean flag = list.removeIf(s->s.getSp()==sp);
		if(!flag) {
			throw new CustomException("no such specaility exists");
		}
		
	}
	
	
}
