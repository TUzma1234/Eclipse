package com.xworkz.nurseing;

public interface HospitalRepository {
	
	int NUMBER_OF_DOCTORS=5;
	void save(String name);
	default void display()
	{

	}

}
