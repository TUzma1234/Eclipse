package com.Xworkz.First;

public class ContactLens {
	static int price;
	String name;
	static void displayStatic()
	{
		price=23000;
	}
	ContactLens(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println("price of ContactLens="+Vaccum.price);
		System.out.println("Name of ContactLens="+this.name);
	}
}
