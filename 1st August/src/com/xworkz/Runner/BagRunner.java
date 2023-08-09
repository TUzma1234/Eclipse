package com.xworkz.Runner;
import com.xworkz.Implementation.BagPack;
import com.xworkz.Implementation.ClutchBag;

public class BagRunner {
	public static void main(String[] args) {
		BagPack SchoolBag = new BagPack();
		SchoolBag.display();
		SchoolBag.open();
	

		ClutchBag LadiesBag = new ClutchBag();
		LadiesBag.display();
		LadiesBag.open();
	}


}
