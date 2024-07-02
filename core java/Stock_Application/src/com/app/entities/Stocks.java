package com.app.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Stocks {
	
//stock id (unique : string), stock name (string), company name(string) , price (double), closing date (Date) , quantity (int)

	private  String stockId;
	private  String stockName;
	private String companyName;
	private double price;
	private LocalDate date;
	private int quantity;
	
	//constructor
	public Stocks(String stockId, String stockName, String companyName, double price, LocalDate date, int quantity) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.companyName = companyName;
		this.price = price;
		this.date = date;
		this.quantity = quantity;
	}

	public Stocks(String stockId2) {
		this.stockId=stockId2;
	}

	//Getter & Setter
	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	//toString
	@Override
	public String toString() {
		return "Stocks [stockId=" + stockId + ", stockName=" + stockName + ", companyName=" + companyName + ", price="
				+ price + ", date=" + date + ", quantity=" + quantity + "]";
	}


	//Equal Override
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Stocks)) {
			return false;
		}
		Stocks other = (Stocks) obj;
		return Objects.equals(stockId, other.stockId);
	}
	
	
	
	
	
	
	
}
