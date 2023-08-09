package com.xworkz.diammond;

public class CoolDrinkRunner {
	
	
	public static void main(String[] args) {

		BTMCoolDrink btmCoolDrink = new BTMCoolDrink();
		btmCoolDrink.cool();
		btmCoolDrink.energy();
		btmCoolDrink.stamina();
		
		System.out.println("Running BTMCoolDrink.........");

		CokeCoolDrink ccd = new BTMCoolDrink();
		ccd.cool();
		ccd.stamina();

		System.out.println("Running CokeCoolDrink...........");

		PepsiCoolDrink pcd = new BTMCoolDrink();
		pcd.cool();
		pcd.energy();


	}


}
