package com.app.utils;

import static com.app.validation.UserValidation.uservalidate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.custexception.CustomException;
import com.app.entities.User;
import com.app.entities.UserType;

public class UserUtility {
	
	//add a method for user login
	public static User Login(String email,String pass,Map<String,User> userMap) throws CustomException {
	 User u1 = uservalidate(email,pass,userMap);
	 if(u1.getUserType()==UserType.ADMIN) {
		 u1.setAdmin(true);
	 }
	return u1;
	}
	
	public static Map<String, User> populatedData(){
		Map<String,User> userMap = new HashMap<>();
		List<User> list = new ArrayList<>(
				Arrays.asList(new User("k@gmail.com","123",UserType.ADMIN),
				new User("k1@gmail.com","789",UserType.CUSTOMER),
				new User("k2@gmail.com","456",UserType.CUSTOMER),
				new User("k3@gmail.com","369",UserType.CUSTOMER)));
		list.forEach(s->userMap.put(s.getEmail(), s));
		return userMap;
	}
	
	
}
