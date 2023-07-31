package com.xworkz.inheritance.app;

public class Sweet extends Jalebi {
	public String noOfpiece;
	public double cost;
	public String Bangalore;
	public boolean ShopOwner;


	public Sweet(String type,int shopNumber,int price,String name,String location ,String noOfpiece,double cost)
	{
		super(type, shopNumber,price, name, location);
		this.noOfpiece=noOfpiece;
		this.cost=cost;
		System.out.println("Constructort with Sweet.............");
		System.out.println("noOfpiece:" +noOfpiece + "\nprice: "+ price);
	}
	
	public void sweetInfo(String Bangalore)
	{
	
		System.out.println("Invoking the method.........");
		System.out.println("Bangalore: " + Bangalore);
	
				
	}
		public void printInfo(boolean  ShopOwner)
		{
			System.out.println("Runtime polymorphism get method..........\nShopOwner:" + ShopOwner);
			
		}
		
}
			



