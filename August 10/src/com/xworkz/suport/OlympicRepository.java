package com.xworkz.suport;

public interface OlympicRepository {
	
	int NUMBER_PLAYERS=12;
	void save(int year);
	default void display() {

	}

}


