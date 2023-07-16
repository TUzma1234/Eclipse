package com.xworkz.third;

public class HotelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running to Hotel");
		Hotel hotel=new Hotel("Qaswa");
		hotel.setLocation("Bijapur");
		hotel.printInfo();
		
		Hotel hotel1=new Hotel("Town palace");
		hotel1.setLocation("Hydreabad");
		hotel1.printInfo();
		

	}

}
