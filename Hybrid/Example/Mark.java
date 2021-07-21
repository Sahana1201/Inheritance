package com.xworz.Inheritance.Hybrid.Example;

public class Mark extends Student {
	int physicsMarks;
	int chemistryMarks;
	int biologyMarks;
	int totalmarks;

	void physicsmarks() {
		System.out.println("physicsmarks ");
	}

	void chemistrymarks() {
		System.out.println("chemistry marks");
	}

	void biologymarks() {
		System.out.println("bio marks");
	}

	void display() {
		System.out.println("PhysicsMarks:-" + physicsMarks + "ChemistryMarks:-" + chemistryMarks + "BiologyMarks"
				+ biologyMarks + "TotalMarks" + totalmarks);
	}

}
