package com.xworkz.equalMethod.app;

public class Vechicle {
	private String name;
	private String brand;
	private String companyName;
	private double price;
	private String location;

	public Vechicle(String name, String brand, String companyName, double price, String location) {
		super();
		this.name = name;
		this.brand = brand;
		this.companyName = companyName;
		this.price = price;
		this.location = location;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Vechicle) {
				System.out.println(this);
				System.out.println(obj);
				Vechicle vehicle = (Vechicle) obj;
				if (this.name == vehicle.name && this.brand == vehicle.brand
						&& this.companyName == vehicle.companyName && this.price == vehicle.price
						&& this.location == vehicle.location) {
					System.out.println("Both are equal");
					return true;
				} else {
					System.err.println("Both are not equal");
				}
			} else {
				System.err.println("Object is not null");
			}
		} else {
			System.err.println("Object is null");
		}
		return false;
	}
}


