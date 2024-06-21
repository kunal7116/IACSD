package com.app.utils;

import java.util.Map;

import com.app.custexception.CustomException;
import com.app.entities.Order;
import com.app.entities.Pet;
import com.app.entities.Status;

public class OrderUtility {

	//add a method for placing order
	public static Order placeOrder(int petId, int quantity, Map<Integer, Order> orderMap, Map<Integer, Pet> petMap)
			throws CustomException {
		Pet p1 = petMap.get(petId);
		if (p1 != null) {
			// System.out.println("id is available");
			if (p1.getStocks() > quantity) {
				Order o1 = new Order(petId, quantity);
				// System.out.println("quantity is available");
				orderMap.put(o1.getOrderId(), o1);
				//for updating stock after order is placed
				p1.setStocks(p1.getStocks() - quantity);
				return o1;
			} else {
				throw new CustomException("Quantity is greater than available stocks");
			}
		} else {
			throw new CustomException("No such pet exists");
		}

	}
	
	//add a method for checking order status
	public static Status orderStatus(int orderId,Map<Integer,Order>orderMap) throws CustomException {
	Order o1 =	orderMap.get(orderId);
	if(o1!=null) {
		//System.out.println("in status");
		return o1.getStatus();
	}
	throw new CustomException("No such orderId exists");
		
	}
	
	//add a method for updating status
	public static void updateStatus(int orderId,String status,Map<Integer,Order>orderMap) throws CustomException{
		Order o1 = orderMap.get(orderId);
		if(o1!=null) {
			o1.setStatus(Status.valueOf(status.toUpperCase()));
		}
		else {
			throw new CustomException("No such order Id exists");
		}
		
	}
}
