package com.app.utils;

import java.util.List;

import com.app.entities.Stocks;

import om.app.exception.CustomException;

public class StockUtility {
	public static Stocks displayByCompanyName(String cname , List<Stocks > stockList) throws CustomException{
		for (Stocks stocks : stockList) {
			if(stocks.getCompanyName().equals(cname)) {
				return stocks;
			}
		}
		throw new CustomException("No such name exists!!");
	}

	
	public static Stocks purchaseStock(String id, int quantity, List<Stocks> list) throws CustomException {
	    for (Stocks stock : list) {
	        if (stock.getStockId().equals(id)&& stock.getQuantity()>quantity) {
	            stock.setQuantity(stock.getQuantity() - quantity);
	            return stock;
	        }
	        else {
	        	throw new CustomException("This much of Quantity is not available");
	        }
	    }
	    throw new CustomException("No such id exists");
	}
	
	public static Stocks sellStock(String id, int quantity, List<Stocks> list) throws CustomException {
	    for (Stocks stock : list) {
	        if (stock.getStockId().equals(id)) {
	            stock.setQuantity(stock.getQuantity() + quantity);
	            return stock;
	        }
	        
	    }
	    throw new CustomException("No such id exists");
	}
	
	
}
