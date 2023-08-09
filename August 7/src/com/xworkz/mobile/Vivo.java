package com.xworkz.mobile;

public interface Vivo {
	
		default String location()
		{
			return ("Invoking the method of location...");
		}
		int price();
	}


