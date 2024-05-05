package com.app.tester;

import java.util.HashSet;
import java.util.Scanner;

import com.app.contact.Contact;
import com.app.contactval.ContactValidation;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			HashSet<Contact> contactList = new HashSet<Contact>();
			while (!exit) {
				System.out.println("----PHONEBOOK MENU----");
				System.out.println("1.Save Contacts \n2.Display Contacts \n3.Exit");
				System.out.println("Enter your choice:");
				int choice = sc.nextInt();
				try {
					switch (choice) {
					case 1:
						System.out.println("Enter Phone Number:");
						String phNum = sc.next();
						System.out.println("Enter the Name:");
						String name = sc.next();
						System.out.println("Enter the Date  of Birth:");
						String dob = sc.next();
						System.out.println("Enter the email:");
						String email = sc.next();
						//Adding data entered by user in the hashset
					   //contactList.add(new Contact(phNum, name, dob, email));
						if(contactList.add(ContactValidation.validateInputs(phNum, name, dob, email, contactList))) {
						//add method of hashset add the value in the hashset if its not present and if the value is already prenet it will return false.
							System.out.println("Contact saved successfully...");
						}
						else
							System.out.println("Contact name and dob already eexists!!");
						break;
					case 2:
						System.out.println("----Displaying Contact Details----");
						for (Contact c : contactList) {
							System.out.println(c);
						}
						break;

					case 3:
						System.out.println("Exiting...");
						exit = true;

					}
				} catch (Exception e) {
					System.out.println(e);
				}

			}
		}
	}
}
