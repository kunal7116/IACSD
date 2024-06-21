package com.app.entities;

public class Pet {
	
	// petId, name, category, unitPrice, stocks
	private int petId;
	private String name;
	private Category category;
	private Double unitPrice;
	private int stocks;
	private static int idGenerator;
	
	//constructor
	public Pet(String name, Category category, Double unitPrice, int stocks) {
		super();
		this.petId = ++idGenerator;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}
	
	public Pet(int id) {
		this.petId=id;
	}

	//getter & setter
	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getStocks() {
		return stocks;
	}

	public void setStocks(int stocks) {
		this.stocks = stocks;
	}


	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", stocks=" + stocks + "]";
	}
	
}
