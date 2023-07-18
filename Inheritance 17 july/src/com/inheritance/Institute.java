package com.inheritance;

public class Institute {
	String name;
	String location;
	int foundingYear;
		
	public Institute(String name,String location,int foundingYear)
	{
		this.name=name;
		this.location=location;
		this.foundingYear=foundingYear;
		System.out.println("Running const of...... ");
		System.out.println("Name="+this.name);
		System.out.println("location="+this.location);
		System.out.println("FoundingYear="+this.foundingYear);
	}

}
