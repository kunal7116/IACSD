package com.app.validation;

import java.time.LocalDate;
import java.util.List;

import com.app.entities.Stocks;

import om.app.exception.CustomException;

public class StockValidation {
	public static Stocks validatInput(String stockId, String stockName, String companyName, double price, String date, int quantity,List<Stocks> stockList) throws CustomException
	{
		dupStockID(stockId,stockList);
		return new Stocks(stockId,stockName,companyName,price,LocalDate.parse(date),quantity);
		
	}
	


	public static Stocks dupStockID(String stockId, List<Stocks>listStocks) throws CustomException{
		Stocks s1= new Stocks(stockId);
		if(listStocks.contains(s1)) {
			throw new CustomException("Id already present");
		}
		return s1;
		
	}
	
}
