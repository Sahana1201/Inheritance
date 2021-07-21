package com.xworkz.Inheritance.SingleInheritance.FatherSonExample;

public class Son extends Father{
	
	boolean isEarning;
	
	public Son() {
		System.out.println("This is Son constructor");
	}
	
	void independent() {
		System.out.println("Son is indenpent ");
	}
	void run() {
		System.out.println("Son can run faster than father ");
	}

}
