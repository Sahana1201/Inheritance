package com.xworz.Inheritance.Hybrid.Example;

public class StudentTester {
	public static void main(String[] args) {

		Mark marks = new Mark();
		marks.biologyMarks = 55;
		marks.chemistryMarks = 65;
		marks.physicsMarks = 85;
		marks.totalmarks = 205;
		marks.biologymarks();
		marks.chemistrymarks();
		marks.display();
		Sports sports = new Sports();
		sports.name = "cricket";
		sports.sportsMarks = 20;
		sports.playingGames();
		sports.display();

	}

}
