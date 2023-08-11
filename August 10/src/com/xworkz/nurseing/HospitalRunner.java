package com.xworkz.nurseing;

public class HospitalRunner {
	
	public static void main(String[] args) {
		HospitalRepository hospitalRepository=new HospitalRepositoryImpl();
		hospitalRepository.save("Kims");
		hospitalRepository.save("Continental");
		hospitalRepository.save("Aster Prime");
		hospitalRepository.save("Medicover");
		hospitalRepository.save("Aware");
		hospitalRepository.display();
	}

}
 


