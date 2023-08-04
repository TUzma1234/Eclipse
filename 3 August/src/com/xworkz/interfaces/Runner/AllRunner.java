package com.xworkz.interfaces.Runner;

import com.xworkz.interfaces.app.airport.AirportRule;

import com.xworkz.interfaces.app.airport.BangolreAirportRule;
import com.xworkz.interfaces.app.Army.MailtreArmyRule;
import com.xworkz.interfaces.app.Army.MailtreArmyRule;
import com.xworkz.interfaces.app.hotel.BasicPubRule;
import com.xworkz.interfaces.app.hotel.VegHotelRule;
import com.xworkz.interfaces.app.saloon.CustomerSaloonRule;
import com.xworkz.interfaces.bank.CustomerBankRule;
import com.xworkz.interfaces.metro.PassengersMetroRule;
import com.xworkz.interfaces.home.HomePeopleRule;

public class AllRunner {
	
	public static void main(String[] args) {



		System.out.println("ArmyRule");
		MailtreArmyRule generalArmyRule = new MailtreArmyRule();
		generalArmyRule.getHairCut();
		generalArmyRule.getUniform();
		System.out.println("Wake Up At :"+MailtreArmyRule. WAKE_UP_AT);



		System.out.println("Hotel Rule");
		VegHotelRule nonVegHotelRule = new VegHotelRule();
		System.out.println("Hotel Type is :"+VegHotelRule.HOTEL_TYPE);
		nonVegHotelRule.getFood();
		nonVegHotelRule.payBill();


		System.out.println("Airport Rule");
		BangolreAirportRule bangloreAirportRule = new BangolreAirportRule();
		System.out.println("Airport Loction is :"+AirportRule.LOCATION);
		bangloreAirportRule.getPassPort();
		bangloreAirportRule.getTicket();

		System.out.println("Pub Rule");
		BasicPubRule highfyPubRule = new BasicPubRule();
		System.out.println("Pub opens at :"+BasicPubRule.OPEN_TIME);
		highfyPubRule.getPartner();
		highfyPubRule.dontFight();
		
		System.out.println("Saloon Rule");
		CustomerSaloonRule saloonRules = new CustomerSaloonRule();
		saloonRules.hairCut();
		
		System.out.println("Bank Rule");
		CustomerBankRule bankRule = new CustomerBankRule();
		bankRule.loan();
		
		System.out.println("Metro Rule");
		PassengersMetroRule metroRule = new PassengersMetroRule();
		metroRule.entry();
		
		System.out.println("home Rule");
		HomePeopleRule homeRules = new HomePeopleRule();
		homeRules.cleaning();
		
		
		
		

	}

}


