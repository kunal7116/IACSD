package com.app.tester;

import com.app.customer.Customer;
import com.app.customer.ServicePlan;
import com.app.custval.CustomerValidation;
import com.app.deleteUser.DeleteUserUtility;
import com.app.login.LoginUtility;
import com.app.setPass.SetPasswordUtility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
//		int i=0;
			// System.out.println("Enter the customer database size:");
			// int size = sc.nextInt();
			// Customer[] customer = new Customer[size];
			List<Customer> customerList = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("-----MENU-----");
				System.out.println("1. Signup \n2.Customer Details \n3.Login \n4.Change Password \n5.Delete Customer \n6.Exit");
				System.out.println("Enter your choice");
				int choice = sc.nextInt();
				try {
					switch (choice) {
					case 1:// Register New Customer
						System.out.println("----Enter the Details-----");
//						System.out.println("Enter the Customer ID:");
//						int cust_id = sc.nextInt();
						System.out.println("Enter the First Name:");
						String first_name = sc.next();
						System.out.println("Enter the Last Name:");
						String last_name = sc.next();
						System.out.println("Enter the Email:");
						String email = sc.next();
						System.out.println("Enter the Password:");
						String password = sc.next();
						System.out.println("Enter the Registration Amount:");
						double reg_amt = sc.nextDouble();
						System.out.println("Enter the DOB:");
						String dob = sc.next();
						System.out.println("Enter the Service Plan:");
						String s_plan = sc.next();
						// customer[i]=new Customer(cid,fname,lname,email,reg_amt,dob,splan);
						Customer cust = CustomerValidation.validateInputs(first_name, last_name, email,
								password, reg_amt, dob, s_plan, customerList);
						customerList.add(cust);
						System.out.println("Data Entered Successfully...");
						break;

					case 2:
						System.out.println("---Customer Details---");
						for (Customer c : customerList)
							System.out.println(c);
						break;

					case 3:
						System.out.println("----LOGIN-----");
						System.out.println("Enter the email");
						String userEmail = sc.next();
						System.out.println("Enter the password");
						String pass = sc.next();
						System.out.println("Login Successful!!");
						System.out.println(LoginUtility.VerifyLogin(userEmail, pass, customerList));
						break;
					
					case 4:
						System.out.println("-----Change you password-----");
						System.out.println("Enter email");
						String userEmail1=sc.next();
						System.out.println("Enter old password");
						String oldpass=sc.next();
						System.out.println("Enter new password");
						String newpass = sc.next();
						System.out.println(SetPasswordUtility.ChangePass(userEmail1,oldpass,newpass,customerList));
						break;

					case 5:
						System.out.println("----Deleting Customer----");
						System.out.println("Enter the email");
						String user1Email=sc.next();
						System.out.println(DeleteUserUtility.DeleteUser(user1Email,customerList));
						break;
					
					case 6:
						System.out.println("Exiting...");
						exit = true;
						break;
					
					default:
						System.out.println("Enter valid Input");
						break;
						
					}
				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			}
		}
	}
}
