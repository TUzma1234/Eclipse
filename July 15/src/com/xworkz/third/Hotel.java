package com.xworkz.third;

public class Hotel {
	String hotelName;
	int numberOfRooms;
	String location;
	String managerName;
	
	
	Owner ref=new Owner("Sunil",94544221,21,"RR nagar","Sakina Manzil");
	Owner ref1=new Owner("Anmol",8833321,23,"Ram nagar","RK Manzil");
	Hotel(String hotelName)
	{
		System.out.println("Running parametrs const");
		this.hotelName=hotelName;
		
	}
	void setLocation(String location)
	{
		this.location=location;
	}
	void printInfo()
	{
		System.out.println("Running the Owner");
		System.out.println("Hotel Name="+this.hotelName);
		System.out.println("Number Of Rooms="+this.numberOfRooms);
		System.out.println("Location="+this.location);
		System.out.println("Manager Name="+managerName);
		this.ref.printInfo();
		this.ref1.printInfo();
	}
}
	
