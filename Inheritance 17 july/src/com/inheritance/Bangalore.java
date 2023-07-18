package com.inheritance;

public class Bangalore extends City {
			String famous;
			public Bangalore(String famous,String name,String location,double distance)
			{
				super(name,location,distance);
				this.famous=famous;
				System.out.print("Running is const");
				System.out.println("Famous="+this.famous);
				System.out.println("Name="+this.name);
				System.out.println("Location="+this.location);
				System.out.println("Distance="+this.distance);
				
			}
	

}
