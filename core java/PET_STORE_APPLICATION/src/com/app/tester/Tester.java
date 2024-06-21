package com.app.tester;

import static com.app.utils.OrderUtility.placeOrder;
import static com.app.utils.PetUtility.addPet;
import static com.app.utils.PetUtility.updatePetDetails;
import static com.app.utils.UserUtility.Login;
import static com.app.utils.UserUtility.populatedData;
import static com.app.utils.OrderUtility.orderStatus;
import static com.app.utils.OrderUtility.updateStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.custexception.CustomException;
import com.app.entities.Order;
import com.app.entities.Pet;
import com.app.entities.User;
import com.app.utils.OrderUtility;

public class Tester {

	public static void main(String[] args) throws CustomException {
		Map<String, User> userMap = new HashMap<>();
		Map<Integer, Pet> petMap = new HashMap<>();
		Map<Integer, Order> orderMap = new HashMap<>();
		userMap = populatedData();
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			System.out.println("Enter the email");
			String email = sc.next();
			System.out.println("Enter password");
			String pass = sc.next();
			User u1 = Login(email, pass, userMap);
			while (!exit) {
				try {
					System.out.println("1. Add new Pet \n" + "2.Update Pet details \n"
							+ "3.Display all available pets \n" + "4.Order a Pet \n"
							+ "5.Check order status by Order Id \n" + "6.Update order status \n" + "7.Exit");
					System.out.println("Enter the choice");
					int choice = sc.nextInt();
					switch (choice) {
					// Add pet
					// Admin task
					case 1:
						if (u1.isAdmin()) {
							System.out.println("Enter name,category,price,stocks");
							addPet(sc.next(), sc.next(), sc.nextDouble(), sc.nextInt(), petMap);
							System.out.println("Pet added successfully");
						} else {
							System.out.println(new CustomException("Not an authorized user"));
						}
						break;

					// Update pet Details
					// Admin task
					case 2:
						if (u1.isAdmin()) {
							System.out.println("Enter id,name,category,price,stocks");
							updatePetDetails(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt(), petMap);
							System.out.println("Updated Successfully");
						}
						break;

					// Display available pets
					// Both admin and customer task
					case 3:
						petMap.forEach((k, v) -> System.out.println(v));
						break;

					// Order a pet
					// Both admin and customer taskS
					case 4:
						System.out.println("Enter the petId and Quantity");
						placeOrder(sc.nextInt(), sc.nextInt(), orderMap, petMap);
						orderMap.forEach((k, v) -> System.out.println(v));
						System.out.println("Your order has placed successfully...");
						break;

					// check order status by order id
					// both admin and customer task
					case 5:
						System.out.println("Enter the order id");
						System.out.println(orderStatus(sc.nextInt(), orderMap));
						break;
					
					//Updating status
					//Admin task
						case 6:
						if(u1.isAdmin()) {
							System.out.println("Enter the Order id");
							int id = sc.nextInt();
							System.out.println("Enter the status");
							updateStatus(id,sc.next(),orderMap);
							System.out.println("Status updated successfully...");
						}
						break;
					case 7:
						System.out.println("Exiting...");
						exit = true;
						break;
					default:
						System.out.println("not a valid input");
						break;
					}

				} catch (Exception e) {

				}

			}

		}
	}

}
