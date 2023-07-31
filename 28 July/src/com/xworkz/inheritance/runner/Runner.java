package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.app.Sweet;
import com.xworkz.inheritance.app.Shop;
import com.xworkz.inheritance.app.Jalebi;
import com.xworkz.inheritance.app.Kanhaiya;


public class Runner {
	 
	public static void main(String []args)
	{
		Shop shop= new  Shop("Sri Ram Sweet","BTM");
		System.out.println();
		
		Jalebi jalebi = new Jalebi("Rasmalai",87,100,"Bee Sweet","Yelahanka Road");
		Jalebi jalebi1 = new Jalebi("Rasmalai",841,100,"Bee Sweet","Indi Road");
		System.out.println();
		
		Kanhaiya kanhaiya = new Kanhaiya("Ladoo"," Bannerghatta Main Road","Fancy Flour");
		System.out.println();
		
		Sweet sweet = new Sweet("Rasmalai",87,100,"Bee Sweet","Yelahanka Road","200",50 );
		sweet.sweetInfo("banglr");
		sweet.printInfo(false);
	}

}
