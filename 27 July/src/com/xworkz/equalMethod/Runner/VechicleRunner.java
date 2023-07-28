package com.xworkz.equalMethod.Runner;
import com.xworkz.equalMethod.app.Vechicle;

public class VechicleRunner {
	public static void main(String[] args) {
		System.out.println("Running main method of Vechicle");
		Vechicle vechicle = new Vechicle("School Bus", "Mahindra", "Tata Motors", 490000, "Baglkoat");
		Vechicle vechicle1 = new Vechicle(" School Bus", "Mahindra","Tata Motors", 500000, "Mumbai");
		System.out.println(vechicle.equals(vechicle1));
	}

}


