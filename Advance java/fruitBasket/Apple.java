package com.fruitBasket;

public class Apple extends Fruit{
	public Apple(String name,String colour,double weight) {
		super(name,colour,weight);
	}
	
	public String taste() {
		return "The taste of apple is Sweet and Sour";
	}
	public void jam() {
		System.out.println(this.name+" apple jam is made");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
