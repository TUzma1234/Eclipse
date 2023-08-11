package com.xworkz.leader;

public class PoliticianRunner {
	
	public static void main(String[] args) {
		PoliticianRepository politicianRepository=new PoliticianRepositoryImpl();
		politicianRepository.save("Congres");
		politicianRepository.save("BJP");
		politicianRepository.save("AMIM");
		politicianRepository.save("NTR");
		politicianRepository.save("Rajendra");
		politicianRepository.display();

	}

}


