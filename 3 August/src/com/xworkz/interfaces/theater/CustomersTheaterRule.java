package com.xworkz.interfaces.theater;
import com.xworkz.interfaces.*;

public class CustomersTheaterRule  implements TheaterRule{
	
	@Override
	public void seating() {
		System.out.println("Running seating CustomerTheaterRule");
	}

}
