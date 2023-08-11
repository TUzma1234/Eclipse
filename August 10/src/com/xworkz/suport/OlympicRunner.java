package com.xworkz.suport;

public class OlympicRunner {
	
	public static void main(String[] args) {
		OlympicRepository olympicRepository=new OlympicRepositoryImpl();
		olympicRepository.save(2012);
		olympicRepository.save(2000);
		olympicRepository.save(2001);
		olympicRepository.save(2005);
		olympicRepository.save(2017);
		olympicRepository.display();

	}

}



