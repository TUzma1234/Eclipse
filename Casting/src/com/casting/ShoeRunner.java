package com.casting;

public class ShoeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Running main method......");
			System.out.println();
			
			Shoe shoe=new Shoe(900, ShoeSize.SHOE8, ShoeColor.MARRON);
			ShoeUtil.get(shoe);
			System.out.println();
			
			Shoe puma=new PumaShoe("Loafer","ittaly",1000,ShoeSize.SHOE7,ShoeColor.BLACK);
			ShoeUtil.get(puma);
			System.out.println();
			
			Shoe nike=new NikeShoe("Donahoe","woods",500, ShoeSize.SHOE6,ShoeColor.WHITE);
			ShoeUtil.get(nike);
	}

}
