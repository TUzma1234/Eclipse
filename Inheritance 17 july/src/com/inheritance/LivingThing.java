package com.inheritance;

public class LivingThing {
	String name;
	int age;
	double height;
	int noOfLivingThing;
	
		public LivingThing(String name,int age,double height,int noOfLivingThing)
		{
			this.name=name;
			this.age=age;
			this.height=height;
			this.noOfLivingThing=noOfLivingThing;
			System.out.println("Running invoking const in LivingThing");
			System.out.println("Name="+this.name);
			System.out.println("Age="+this.age);
			System.out.println("Height="+this.height);
			System.out.println("No Of LvingThing="+this.noOfLivingThing);
			
		}

}
