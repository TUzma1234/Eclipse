package com.xworkz.karnataka.app.runner;

import com.xworkz.karnataka.app.ArmyNamesRepository;
import com.xworkz.karnataka.app.ArmyNamesRepositoryImpl;

public class ArmyNamesRepositoryRunner {
	

	public static void main(String[] args) {
		ArmyNamesRepository armynames=new ArmyNamesRepositoryImpl();
		System.out.println("Invoking the  army name******");
		armynames.army("Indian Coast Guard");
		armynames.army("Indian Naval Air Arm");
		armynames.army("Defence Security Corps");
		armynames.army("National Security Guard");
		armynames.army("Corps of Army Air Defence");
		System.out.println("Running the armynames*******");
		armynames.print();
	}

}


