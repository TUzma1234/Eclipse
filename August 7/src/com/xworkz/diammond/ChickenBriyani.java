package com.xworkz.diammond;

public class ChickenBriyani implements Briyani,VegBriyani,MuttonBriyani{

	@Override
	public int price() {
		System.out.println("Invoking the  price of  method in ChickenBriyani....");
		return 0;
	}

	@Override
	public String Delicious() {
		System.out.println("Invoking  the delicious method in ChickenBriyani....");
		return null;
	}

	@Override
	public String Mutton() {
		System.out.println("Invoking the  Mutton method in ChickenBriyani......");
		return null;
	}

	@Override
	public int VegBriyani() {
		// TODO Auto-generated method stub
		return 0;
	}


}


