package com.xworkz.interfaces.app.hotel;

public class VegHotelRule implements HotelRule  {
	
	@Override
	public void payBill() {
		System.out.println("Should Pay the Bill");
	}

	@Override
	public void getFood() {
		System.out.println("Should Order the Food");
	}
}


