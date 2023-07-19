package com.casting;

public class NikeShoe extends Shoe {
	String ceo;
	String brandAmbassador;
	
	public NikeShoe(String ceo,String brandAmbassador,int price,ShoeSize size,ShoeColor color)
	{
		super(price,size,color);
		this.ceo=ceo;
		this.brandAmbassador=brandAmbassador;
		System.out.println("invoking const");
	}
	void printInfo()
	{
		System.out.println("ceo of NikeShoe:"+ceo);
		System.out.println("brandAmbassador of NikeShoe:"+brandAmbassador);
		
	}
}
