package com.casting;


public class ShoeUtil {
	static void get(Shoe shoe)
	{
		if(shoe!=null)
		{
				System.out.println("Shoe price:"+shoe.price);
				System.out.println("Shoe size:"+shoe.size);
				System.out.println("Shoe color:"+shoe.color);
				
				if(shoe instanceof PumaShoe)
				{
					PumaShoe puma=(PumaShoe)shoe;
					puma.printInfo();
				}
				if(shoe instanceof NikeShoe)
				{
					NikeShoe nike=(NikeShoe)shoe;
					nike.printInfo();
					
				}
		}
	}

}
