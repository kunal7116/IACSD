package com.app.tester;

import static com.app.validation.StockValidation.validatInput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static com.app.utils.StockUtility.*;
import com.app.entities.Stocks;
import static com.app.utils.StockUtility.purchaseStock;
import static com.app.utils.StockUtility.sellStock;

import om.app.exception.CustomException;

public class Client {

	public static void main(String[] args) throws CustomException{
	try(Scanner sc = new Scanner(System.in)){
		List<Stocks>stockList= new ArrayList<>();
		boolean exit = false;
		while(!exit) {
			System.out.println("1.Add Stocks \n"
							+"2.View Available stocks by Company name \n"
							+"3.Purchase stocks \n"
							+"4.Sell Stocks \n"
							+"5.sort by company name \n"
							+"6.Display \n"
							+"7.exit");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			try {
				switch (choice) {
				
				//add stocks
				case 1:
					System.out.println("Enter Details of stocks:");
					System.out.println("StockID,StockName,CompanyName,Price,ClosingDate,Quantity");
					Stocks s1 = validatInput(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.nextInt(), stockList);
					stockList.add(s1);
					System.out.println("Stocks aaded successfully");
					break;
				
				//display stocks
				case 2:
					System.out.println("Enter the company name");
					Stocks s =  displayByCompanyName(sc.next(),stockList);
					System.out.println(s);
					break;
				
				//purchase stocks
				case 3:
					System.out.println("Enter stockid,quantity");
					purchaseStock(sc.next(),sc.nextInt(),stockList);
					System.out.println("Stocks purchased successfully");
					break;
					
				
				//sell stocks
				case 4:
					System.out.println("Enter stockid,quantity");
					sellStock(sc.next(),sc.nextInt(),stockList);
					System.out.println("Stocks Selled successfully");
					break;
					
				//sort stocks
				case 5:
					stockList.sort(Comparator.comparing(Stocks::getCompanyName));
					for (Stocks stocks : stockList) {
						System.out.println(stocks);
					}
					break;
					
				case 6:
					for (Stocks stocks : stockList) {
						System.out.println(stocks);
					}
					break;
				case 7:
					exit=true;
					break;
				default:
					System.out.println("Not valid input");
					break;
				}
			}catch(CustomException e){
				System.out.println( e.getMessage());
			}
		}		
	}

	}

}
