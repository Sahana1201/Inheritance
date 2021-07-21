package com.xworz.Inheritance.UsingSuper;

public class Flower {
	String color;
	int price;
	String smell;
	String types;

	Flower() {

		System.out.println("default constructor");
	}

	public Flower(String color, int price, String smell, String types) {
		super();
		this.color = color;
		this.price = price;
		this.smell = smell;
		this.types = types;
	}

	void purposeOfPooja() {
		System.out.println("flowers are used for pooja");
	}

	void usedForDecorate() {
		System.out.println("flowers are used for decorating");
	}

	void display() {
		System.out.println("color : " + color + "price : " + price + "smell : " + smell + "types: " + types);
	}

}
