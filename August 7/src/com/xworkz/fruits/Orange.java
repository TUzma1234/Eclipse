package com.xworkz.fruits;

public interface Orange extends CustardApple{
	String yummy();
	default String brand()
	{
		return "Heavenly Bites";
	}


}
