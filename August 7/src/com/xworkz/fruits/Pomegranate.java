package com.xworkz.fruits;

public class Pomegranate  implements CustardApple,Orange,Banana {
	
	@Override
	public String sweet() {
		System.out.println("Invoking the  sweet method in pomegranate ");
		return null;
	}

	@Override
	public String yummy() {
		System.out.println("Invoking the  yummy method in pomegranate");
		return null;
	}

	@Override
	public String Tasty() {
		System.out.println("Invoking the Tasty method in pomegranate");
		return null;
	}

	

	

}


