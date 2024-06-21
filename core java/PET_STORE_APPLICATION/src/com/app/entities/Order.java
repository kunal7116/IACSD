package com.app.entities;

public class Order {
	
	//orderId, petId, quantity, status
	private int orderId;
	private int petId;
	private int quantity;
	private Status status;
	private static int idGenerator;
	
	//constructor
	public Order(int petId, int quantity) {
		super();
//		++idGenerator;
		this.orderId =++idGenerator;
		this.petId = petId;
		this.quantity = quantity;
		this.status = Status.PLACED;
	}

	
	
	
	//getter & setter
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	//ToString
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status + "]";
	}

	
	
	
	
}
