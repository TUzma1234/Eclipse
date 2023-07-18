package com.inheritance;

public class Xworkz extends Institute {
	int branches;
	
	public Xworkz (int branches,String name,String location,int foundingYear)
	{
		super(name,location,foundingYear);
		this.branches=branches;
		System.out.println("Running the const");
		System.out.println("Branches=+this.branches");
		System.out.println("Name=+this.name");
		System.out.println("Location=+this.location");
		System.out.println("FoundingYear=+this.foundingYear");
	}

}




