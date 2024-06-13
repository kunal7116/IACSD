package com.app.tester;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static com.app.validation.CricketerValidation.*;
import static com.app.utils.CricketerUtility.*;
import com.app.entities.Cricketer;
import com.app.entities.Speciality;
import com.app.exception.CustomException;

public class Client {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Cricketer> list = new ArrayList<>();
			boolean exit = false;
			while(!exit) {
				System.out.println("1.Add Cricketers in the collection.\r\n"
						+ "2.Modify Cricketer's rating\r\n"
						+ "3.Search Cricketer by name\r\n"
						+ "4.Display all Cricketers added in collection.\r\n"
						+ "5.Display All Cricketers in sorted form by rating.\r\n"
						+ "6.Remove cricketer by name \n"
						+ "7.Remove cricketer as per speciality \n"
						+ "8.Exit");
				System.out.println("Enter the choice");
				int choice = sc.nextInt();
				try {
					switch (choice) {
					case 1:
						System.out.println("Enter name,age,email,phoneNum,rating");
						Cricketer c = validateAllInputs(sc.next(), sc.nextInt(), sc.next(),sc.next(), sc.nextInt(),sc.next(),list);
						list.add(c);
						System.out.println("Added");
						break;
						
					case 2:
						System.out.println("Enter email and new rating");
						updateCricketerRating(sc.next(),sc.nextInt(),list);
						System.out.println("Updated");
						break;
					case 3: 
						System.out.println("Enter the name of the cricketer");
						Cricketer c1 = searchByName(sc.next(),list);
						System.out.println(c1);
						break;
						
					case 4:
						for (Cricketer cricketer : list) {
							System.out.println(cricketer);
						}
						break;
						
					case 5:
						list.sort(Comparator.comparing(Cricketer::getRating));
						for (Cricketer cricketer : list) {
							System.out.println(cricketer);
						}
						break;
						
					case 6:
						System.out.println("Enter the name");
						removeCricketerByName(sc.next(),list);
						break;
					case 7:
						System.out.println("Enter speciality");
						removeByEnum(Speciality.valueOf(sc.next().toUpperCase()),list);
						break;
					case 8:
						exit = true;
						break;
					default:
						System.out.println("Inavlid input");
						break;
					}
					
					
					
					
					
					
				} catch (CustomException e) {
					System.out.println(e.getMessage());
				}
			}
			
		}

	}

}
