package com.xworkz.inheritance.app;

public class Shop {
	 public String name;
	 public String  location;
	 
	 public Shop() {
		 super();
	 }
	 
	 public Shop(String name,String location)
	 {
		 
	  this.name=name;
	  this.location=location;
	  System.out.println("Running the constructor...........");
	  System.out.println("name:"+ name+ "\n name: " + name );
	 }

}



