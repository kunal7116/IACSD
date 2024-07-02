package com.app.tester;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.entities.Employee;
import static com.app.utils.EmployeeUtility.addFullTimeEmp;
import static com.app.utils.EmployeeUtility.addPartTimeEmp;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Employee> empList = new ArrayList<>();
			boolean exit = false;
			System.out.println("Welcome to Employee Managment System");
			while(!exit) {
				System.out.println("1.Add full time employee\r\n"
						+ "2.Add part time employee\r\n"
						+ "3.Delete an employee by Emp Id\r\n"
						+ "4.Search employee details by Aadhaar number\r\n"
						+ "5.Display all employee details\r\n"
						+ "6.Display all employee details sorted by date of joining\r\n"
						+ "7.Exit");
				System.out.println("Enter your choice");
				int choice = sc.nextInt();
				try {
					switch(choice) {
					//add fullTimeEmp
					case 1:
						
						// Name, Date of joining, Phone Number, Aadhaar number 
						System.out.println("Enter Details -- name, Date of joining, Phone Number, Aadhaar number, Montly sal");
						addFullTimeEmp(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), empList);
						System.out.println("Employee added Successfully");
						break;
					
						//add partTimeEmp
					case 2:
						
						// Name, Date of joining, Phone Number, Aadhaar number 
						System.out.println("Enter Details -- name, Date of joining, Phone Number, Aadhaar number, Hourly pay");
						addPartTimeEmp(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), empList);
						System.out.println("Employee added Successfully");
						break;
					
						//delete employee
					case 3:
						
							System.out.println("Enter Id");
							int id = sc.nextInt();
							empList.removeIf(s->s.getEmpId()==id);
							
					break;
				
					//search by aadhar num 
					case 4:
						System.out.println("Enter aadhar Num");
						String aadharNum = sc.next();
						empList.stream().filter(s->s.getAdhaarNum().equals(aadharNum)).forEach(l->System.out.println(l));
					break;
					
					//diplay emp details
					case 5:
					for (Employee employee : empList) {
						System.out.println(employee);
					}	
					System.out.println("Deleted successfully...");
					break;
					
					//sort by doj
					case 6:
						empList.sort(Comparator.comparing(Employee::getDoj));
						break;
					
					//exit	
					case 7:
						exit=true;
						System.out.println("Exiting...");
						break;
					default:
						System.out.println("Inavlid Input");
						break;
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		}

	}

}
