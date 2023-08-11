package com.xworkz.equipment;

public class ArmyRunner {
	
	public static void main(String[] args) {
		ArmyRepository armyRepository=new ArmyRepositoryImpl();
		armyRepository.save("Punith");
		armyRepository.save("Aadhya");
		armyRepository.save("Aadhira");
		armyRepository.save("Aakriti");
		armyRepository.save("Roshini");
		armyRepository.display();

	}




}
