package com.Xworkz.First;

public class Tv {
	 String nameOfCompany;
	static int price;
	static void displayStatic()
	{
		price=45000;
	}
	Tv(String nameOfCompany)
	{
		this.nameOfCompany=nameOfCompany;
	}
	void display()
	{
		System.out.println("Tv price="+Tv.price);
		System.out.println("nameOfCompany of Tv="+this.nameOfCompany);
	
	}

}
