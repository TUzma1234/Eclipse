package com.xworkz.karnataka.app.runner;

import com.xworkz.karnataka.app.ApartmentRepository;
import com.xworkz.karnataka.app.ApartmentRepositoryImpl;


public class ApartmentRepositoryRunner {
	

	public static void main(String[] args) {
		ApartmentRepository apartment=new ApartmentRepositoryImpl();
		System.out.println("Invoking the apartment name in  the array.........");
		apartment.name("Urban Haven Apartment");
		apartment.name(" Elevated Abode Apartment");
		apartment.name(" Luxe Loft Apartment");
		apartment.name(" Golden Grotto Apartment");
		apartment.name(" Velvet Vista Apartment");
		System.out.println("Running the all name of the apartment.......");
		apartment.display();

	}

}


