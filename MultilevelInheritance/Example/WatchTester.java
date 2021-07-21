package com.xworx.Inheritance.MultilevelInheritance.Example;

public class WatchTester {

	public static void main(String[] args) {
		SmartWatch smart = new SmartWatch();
		
		smart.isGPSavailable = true;
		smart.stepWeCovered = 122;
		smart.brand ="Fast track";
		smart.colour = "black";
		smart.havingLedDisplay = true;
		smart.heartRate = 99;
		smart.isGPSavailable = true;
		smart.price =2500;
		smart.display();
		smart.bloodpresure();

	}

}
