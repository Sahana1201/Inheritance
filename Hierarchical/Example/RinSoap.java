package com.xworz.Inheritance.Hierarchical.Example;

public class RinSoap extends Soap {
	boolean ishardness;
	String colour;

	void washingCloths() {
		System.out.println("used to wash cloths");
	}

	void dirtcleaning() {
		System.out.println("used to remove dirt from cloths ");
	}

	void display() {
		System.out.println("Having HArdness:-" + ishardness + "Colour:-" + colour);
	}

}
