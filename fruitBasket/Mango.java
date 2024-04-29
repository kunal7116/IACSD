package com.fruitBasket;

public class Mango extends Fruit {

	public Mango(String name,String colour,double weight) {
		super(name,colour,weight);
		
	}
	public String taste() {
		return "The Taste of Mango is Sweet";
	}
	
	public void pulp() {
		System.out.println(this.name+" mango pulp is made"+",the colour is "+this.colour);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
