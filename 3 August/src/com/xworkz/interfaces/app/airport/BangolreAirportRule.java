package com.xworkz.interfaces.app.airport;
import com.xworkz.interfaces.app.airport.*;
public class BangolreAirportRule implements AirportRule {
	
	@Override
	public void getTicket() {
		System.out.println("Ticket should be booked");

	}

	@Override
	public void getPassPort() {
		System.out.println("PassPort Should be Taken");

	}


}
