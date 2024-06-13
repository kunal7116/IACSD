package com.fruitBasket;

import java.util.Scanner;

public class FruitUtility {

	public static void displayBasket(Fruit[] f, int size) {
		for (int i = 0; i < size; i++) {
				System.out.println(f[i]);
				System.out.println(f[i].taste());
	}
	}
	public static void speciality(Fruit[] f,int size) {
		for (int i=0;i<f.length;i++) {

			if (f[i] instanceof Apple) {
				((Apple) f[i]).jam();
			}
			if (f[i] instanceof Orange) {
				((Orange) f[i]).juice();
			}
			if (f[i] instanceof Mango) {
				((Mango) f[i]).pulp();
			}
	}
}
	public static void markStale(Fruit[] f, int size,int ch) {
		f[ch].fresh=false;
	}	
	
	public static void markss(Fruit []f,int i) {
		String str="sour";
		for(int j=0;j<i;j++) {
		if(f[j].taste().equalsIgnoreCase(str)) {
			f[j].fresh=false;
		}
		}
		
	}
}
