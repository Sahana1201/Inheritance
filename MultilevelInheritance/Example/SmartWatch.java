package com.xworx.Inheritance.MultilevelInheritance.Example;

public class SmartWatch extends DigitalWatch {
	boolean isGPSavailable;
	int stepWeCovered;
	int heartRate;

	void keeptrackofrunning() {
		System.out.println("its keep tract of running");
	}

	void dailyActivity() {
		System.out.println("keep track of daily activity");
	}

	void bloodpresure() {
		System.out.println("it keep tract the persons bool presure");
	}

	void Playmusic() {
		System.out.println("it can play music");
	}

	void display() {
		System.out.println("brand:" + brand + "Price=" + price + "colour:" + colour + "havingbutton:" + isbutton
				+ "havingLedDisplay" + havingLedDisplay);
	}

}
