package com.xworkz.karnataka.app.runner;


import com.xworkz.karnataka.app.OlympicNameRepository;
import com.xworkz.karnataka.app.OlympicNameRepositoryImpl;


public class OlympicNameRepositoryRunner {

	
	public static void main(String[] args) {
		OlympicNameRepository olympic=new OlympicNameRepositoryImpl() ;
		System.out.println("Storing years of olympics in array");
		olympic(judo);
		olympic(Badminton);
		olympic(Football);
		olympic(Circket);
		olympic(Vallyball);
		System.out.println("Displaying all the years of olympics");
		olympic.display();
	}

}

