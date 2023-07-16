package com.xworkz.third;

public class Franchise {
	int numberOfBranches;
	String name;
	int foundingYear;
	String location;
	Franchise(int numberOfBranches,String name,int foundingYear,String location)
	{
		this.numberOfBranches=numberOfBranches;
		this.name=name;
		this.foundingYear=foundingYear;
		this.location=location;
	}
	void printInfo()
	{
		System.out.println("Number Of Branches="+this.numberOfBranches);
		System.out.println("Name="+this.name);
		System.out.println("FoundingYear="+this.foundingYear);
		
		
		
	}

}
