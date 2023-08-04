package com.xworkz.interfaces.app.hotel;
import com.xworkz.interfaces.app.*;

public class BasicPubRule implements PubHotel {
	
	@Override
	public void getPartner() {
		System.out.println("Should Bring a partner");

	}

	@Override
	public void dontFight() {
		System.out.println("Should not fight inside Pub");		
	}

}


