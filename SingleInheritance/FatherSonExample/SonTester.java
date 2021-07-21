package com.xworkz.Inheritance.SingleInheritance.FatherSonExample;

public class SonTester {

	public static void main(String[] args) {
		Father murthy = new Father();
		murthy.name = "Murthy";
		murthy.age = 45;
		murthy.hairColour = "black";
		murthy.display();
		murthy.sitting();
		murthy.earning();
		murthy.walking();
		
		Son Darma = new Son();
		Darma.name ="Darma";
		Darma.age = 25;
		Darma.hairColour="black";
		Darma.isEarning = true;
		Darma.display();
		Darma.sitting();
		Darma.run();
		Darma.independent();
		
	   

	}

}
