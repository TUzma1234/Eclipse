package com.inheritance;

public class Building {
	String name;
	int height;
	double width;
	
	public Building(String name,int height,double width)
	{
		this.name=name;
		this.height=height;
		this.width=width;
		
		System.out.println("Running no arg const");
		System.out.println("Name="+this.name);
		System.out.println("Height="+this.height);
		System.out.println("Width="+this.width);
	}

}
