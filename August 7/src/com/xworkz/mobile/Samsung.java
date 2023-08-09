package com.xworkz.mobile;

public interface Samsung extends Vivo{
	
	default String nameOfcampany()
	{
		return ("Invoking the nameOfcampany method is samsung .........");
	}
}


