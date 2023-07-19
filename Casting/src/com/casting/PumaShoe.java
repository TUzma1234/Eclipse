package com.casting;

public class PumaShoe extends Shoe {
	String model;
	String origin;
	
	public PumaShoe(String model,String origin,int price,ShoeSize size, ShoeColor color)
	{
		super(price,size,color);
		this.model=model;
		this.origin=origin;
		System.out.println("Invoking const.....");
	}
	void printInfo()
	{
		System.out.println("Model of pumaShoe:"+model);
		System.out.println("Origin of pumaShoe:"+origin);
	}

}
