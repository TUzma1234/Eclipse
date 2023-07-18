package com.inheritance;

public class Plant extends LivingThing {

	boolean Alive;
	
	public Plant(boolean Alive,String name,int age,double height,int noOfLivingThing) 
	{
		super (name,age,height,noOfLivingThing);
		this.Alive=Alive;
		System.out.println("Running extends const");
		System.out.println("Alive="+this.Alive);
		System.out.println("Name="+this.name);
		System.out.println("Age="+this.age);
		System.out.println("Height="+this.height);
		System.out.println("No Of LivingThing="+this.noOfLivingThing);
	}
	

}
