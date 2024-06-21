package com.app.utils;

import java.util.HashMap;
import java.util.Map;


import com.app.entities.Pet;
import com.app.entities.Status;
import com.app.custexception.CustomException;
import com.app.entities.Category;
import com.app.entities.Order;


public class PetUtility {
	
	//add a method for adding pet
	public static Pet addPet(String name,String category,double price,int stocks,Map<Integer, Pet> map) throws CustomException {
		
		Category c = parseCategory(category);
		Pet pet = new Pet(name, c, price, stocks);
		map.put(pet.getPetId(), pet);
		return pet;
	}
	
	private static Category parseCategory(String category) throws CustomException {
		Category c = Category.valueOf(category.toUpperCase());
		if(c==null) {
			throw new CustomException("No such category exists");
		}
		return c;
	}

	//add a method for updating pet details
	public static Pet updatePetDetails(int id,String name,
			String category,double price,
			int stocks,Map<Integer, Pet> map) throws CustomException{
		
		Pet p1= map.get(id);
		if(p1!=null) {
			p1.setName(name);
			p1.setCategory(Category.valueOf(category.toUpperCase()));
			p1.setUnitPrice(price);
			p1.setStocks(stocks);
			return p1;
		}
		else {
		throw new CustomException("Not valid id");
		}
	}
	

	
}
