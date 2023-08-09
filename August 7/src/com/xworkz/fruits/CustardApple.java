package com.xworkz.fruits;

public interface CustardApple {
	
	String Tasty();
	default int price()
	{
		return 0;
	}
}


