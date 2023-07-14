package com.xworkz.second;

public class TheaterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theater theater=new Theater("Dreamland theater");
		theater.address="M G Road Bijapur ";
		theater.typeOfTheater(TheaterType.AC);
		theater.display();
		Theater theater1=new Theater("Laxmi theatre");
		theater1.address="Bscl office road";
		theater1.typeOfTheater(TheaterType.Normal);
		theater1.display();
	}

}
