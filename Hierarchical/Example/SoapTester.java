package com.xworz.Inheritance.Hierarchical.Example;

public class SoapTester {

	public static void main(String[] args) {
		DoveSoap soap = new DoveSoap();
		soap.creamy = true;
		soap.name = "Dove";
		soap.price = 25;
		soap.cleansing();
		soap.display();
		RinSoap rinsoap = new RinSoap();
		rinsoap.colour = "blue";
		rinsoap.ishardness = true;
		rinsoap.price = 20;
		rinsoap.dirtcleaning();
		rinsoap.name = "RIN";
		rinsoap.display();

	}

}
