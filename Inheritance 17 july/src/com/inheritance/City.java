package com.inheritance;

public class City {
	String name;
	String location;
	double distance;
	{
		System.out.println("Running invoking the const");
	}
	City(String name,String location,double distance)
	{
		this.name=name;
		this.location=location;
		this.distance=distance;
		System.out.println("Name="+this.name);
		System.out.println("Location="+this.location);
		System.out.println("Distance="+this.distance);
	
	
	}

}
