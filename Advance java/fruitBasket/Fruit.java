package com.fruitBasket;

import java.util.Scanner;

public abstract class Fruit {
	
	protected String name;
	protected String colour;
	protected double weight;
	protected boolean fresh;
	
	public Fruit() {
		name = "NA";
		colour = "No-Colour";
		weight = 0.00;
		fresh= true;
	}
	
	public Fruit(String name,String colour,double weight) {
		this.name=name;
		this.colour=colour;
		this.weight=weight;
		this.fresh=true;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public String toString() {
		if(this.fresh)
		{
			return "Name-"+this.name+" Colour-"+this.colour+" Weight-"+this.weight+ "\nFruit is Fresh!";
		}
		else
		{
			return "Name-"+this.name+" Colour-"+this.colour+" Weight-"+this.weight+ "\nFruit is Stale!";
		}
	}
	
	
	public abstract String taste();
	
}
