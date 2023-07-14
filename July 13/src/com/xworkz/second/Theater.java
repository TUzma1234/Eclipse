package com.xworkz.second;

public class Theater {
	String theaterName;
	int price=500;
	TheaterType theaterType;
	String address;
	Theater(String theaterName)
	{
			this.theaterName=theaterName;
	
	}
	void typeOfTheater(TheaterType theaterType)
	{
			this.theaterType=theaterType;
	}
	void display()
	{
			System.out.println("Theater Name="+this.theaterName);
			System.out.println("Price of="+this.price);
			System.out.println("Theater type="+this.theaterType);
			System.out.println("Address="+this.address);
	
	}
}
