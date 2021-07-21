package com.xworkz.Inheritance.SingleInheritance.FatherSonExample;

public class Father {
	String name;
	int age;
	String hairColour;

	void sitting() {
		System.out.println("Father can sit ");

	}

	void walking() {
		System.out.println("Father can walk");

	}

	void earning() {
		System.out.println("Father is the earning man in family");

	}

	void display() {
		System.out.println("Name:" + name + "Age:" + age + "HairColour:" + hairColour);
	}

}
