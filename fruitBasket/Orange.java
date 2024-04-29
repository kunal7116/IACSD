package com.fruitBasket;

public class Orange extends Fruit {

	public Orange(String name,String colour,double weight) {
		super(name,colour,weight);
		
	}
	public String taste() {
		return "sour";
	}
	
	public void juice() {
		System.out.println(this.name+" orange juice is made"+" and Weight is "+this.weight);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
