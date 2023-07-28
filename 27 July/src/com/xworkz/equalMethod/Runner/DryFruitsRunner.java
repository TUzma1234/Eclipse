package com.xworkz.equalMethod.Runner;
import com.xworkz.equalMethod.app.DryFruits;
public class DryFruitsRunner {
	public static void main(String[] args) {
		System.out.println("Running main method ");
		DryFruits dryfruits= new DryFruits("Dates","Nuts","Bijapur","Nutraj",1000,30);
		DryFruits dryfruits1= new DryFruits("Dates","Nuts","Goa","Nutraj ",3000,30);
		System.out.println(dryfruits.equals(dryfruits1));
	}

}


