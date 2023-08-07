package com.xworkz.Train;

public class ChennaiExpress implements ExpressTrain,GoodsTrain {
	
	@Override
	public void heavyThingCarry() {
		System.out.println("Running heavyCarry method in ChennaiExpress");
	}
	
	@Override
	public void storage() {
		System.out.println("Running storage method in chennaiExpress");
	}
	
	@Override
	public void travel() {
	System.out.println("Running travel method in chennaiExpress");
	}

}
