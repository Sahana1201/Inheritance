package com.xworz.Inheritance.Hierarchical.Example;

public class DoveSoap extends Soap {

	boolean creamy;

	void isCreamy() {
		System.out.println("this is measures the stability and creaminess of the soap");
	}

	void cleansing() {
		System.out.println("ability of the soap to trap dirt on the skin");
	}

	void display() {
		System.out.println("Creamy" + creamy+ "Name: " + name +  "Smell:-" + smell + "Price:-" + price);
	}
}
