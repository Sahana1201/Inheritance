package com.xworz.Inheritance.UsingSuper;

public class Rose extends Flower {
	boolean thorn;

	Rose() {
		super("red", 10, "sweet", "rose");
		
		super.purposeOfPooja();
		System.out.println("this is rose flower");
	}

	void purposeOfHairStyle() {
		System.out.println("used for hair Style");

	}
}


