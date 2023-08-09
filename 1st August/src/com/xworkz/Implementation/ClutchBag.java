package com.xworkz.Implementation;
import com.xworkz.Abstraction.Bag;

public class ClutchBag extends Bag {
	public final void carry() {
		System.out.println("Carring Bag.........");
	}

	@Override
	public void display() {
		System.out.println("Displayed the ClutchBag..........");
	}
}


