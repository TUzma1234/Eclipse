package com.xworkz.inheritance.app;

public class Jalebi extends Shop {
	public String type;
	public int shopNumber;
	public int price;
	
	public Jalebi(String type,int shopNumber,int price,String name,String location)
	{
		super(name,location);
		this.type=type;
		this.shopNumber=shopNumber;
		System.out.println("Super class  chaining.........");
		System.out.println("type: " +type + "\nshopNumber: " + shopNumber);
	}
		public Jalebi(String type,String brand,int price)
		{
			this.type=type;
			this.shopNumber=shopNumber;
			this.price=price;
			System.out.println("constructor overloading.........");
			System.out.println("type: " +type + "\nshopNumber: " + shopNumber + "\nprice: " + price);
			
		
	}

}
