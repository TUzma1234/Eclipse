package com.xworkz.equalMethod.Runner;
import com.xworkz.equalMethod.app.Slipper;

public class SlipperRunner {

	public static void main(String[] args) {
		System.out.println("Running main in DryFruitRunner");
		Slipper slipper = new Slipper("Bata", "Bijapur", "Adidas", 6, "Loafer", "Sandel",900);
		Slipper slipper1 = new Slipper("Bata", "Bijapur", "Adidas", 7, "Loafer", "Sandel",500);
		System.out.println(slipper.equals(slipper1));
	}

}


