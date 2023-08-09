package com.xworkz.diammond;

public class BriyaniRunner {
	
	public static void main(String[] args) {
		Briyani briyani=new ChickenBriyani();
	
		briyani.Delicious();
		briyani. flavourful();

		MuttonBriyani mutton=new ChickenBriyani();
		mutton.Mutton();
		mutton.price();
		mutton.Mutton();

         VegBriyani veg=new ChickenBriyani();
         veg.VegBriyani();
         veg.VegBriyani();
		 veg.tasty();

		ChickenBriyani chicken=new ChickenBriyani();
		chicken.Mutton();
	    chicken.VegBriyani();
		chicken.price();
		chicken.tasty();

	}

}


