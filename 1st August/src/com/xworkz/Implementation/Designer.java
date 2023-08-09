package com.xworkz.Implementation;
import com.xworkz.Abstraction.Fashion;

public class Designer extends Fashion {
	public final void wear() {
		System.out.println("Designer the saree.......");
	}

	@Override
	public void display() {
		System.out.println("Displayed the Designer clothes.......");
	}

}
