package com.xworkz.Implementation;
import com.xworkz.Abstraction.Vehicle;

public class Car extends Vehicle{
	public final void Horn() { 

		System.out.println("..........!");
	}

	@Override 

	public void start() {
		System.out.println("Started the Car......");
	}

}
