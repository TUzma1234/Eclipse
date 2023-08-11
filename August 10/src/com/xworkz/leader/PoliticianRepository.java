package com.xworkz.leader;

public interface PoliticianRepository {
	
	int NUMBER_POLITICIAN=10;
	void save(String name);
	default void display()
	{

	}

}


