package com.app.validation;

import java.util.Map;

import com.app.custexception.CustomException;
import com.app.entities.User;

public class UserValidation {

	public static User uservalidate(String email, String pass, Map<String, User> userMap) throws CustomException {
		User u1 = userMap.get(email);
		if (u1 != null) {
			if (u1.getPassword().equals(pass)) {
				return u1;
			}
		}
		throw new CustomException("Not valid Login creditnals");
	}
	


}
