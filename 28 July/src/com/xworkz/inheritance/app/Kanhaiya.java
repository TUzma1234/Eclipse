package com.xworkz.inheritance.app;

public class Kanhaiya extends Shop {
	
	public String brand;
	
	public Kanhaiya(String name,String location, String brand) {
		super( name, location);
		this.brand=brand;
		System.out.println("Constructor is invoking the Kanhaiya..........");
		System.out.println("Constructor is  Kanhaiya Inheritance..........");
		System.out.println("brand:" + brand);
	}

}
