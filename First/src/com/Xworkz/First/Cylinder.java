package com.Xworkz.First;

public class Cylinder {
	static String name;
	int price;
	static void displaystatic()
	{
			name="Bharath";
	}
	Cylinder(int price)
	{
			this.price=price;
	}
	void display()
	{
			System.out.println("Name of cylinder="+Cylinder.name);
			System.out.println("price of cylinder="+this.price);
	}
}
