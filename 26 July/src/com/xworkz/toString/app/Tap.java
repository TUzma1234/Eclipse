package com.xworkz.toString.app;

public class Tap {
	private String type;
	private String name;
	private String location;
	private String brand;
	private double warranty;

	@Override
	public String toString() {

		return "type: " + type +"\n"+ "name: " + name +"\n"+ "location: " + location +"\n"+ "brand " + brand +"\n"+ "warranty " + warranty;
	}

	public String getType() {
		return type;
	}

	public String getname() {
		return name;
	}

	public String getlocation() {
		return location;
	}

	public String getbrand() {
		return brand;
	}

	public double getWarranty() {
		return warranty;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setlocation(String location) {
		this.location = location;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public void setWarranty(double warranty) {
		this.warranty = warranty;
	}

}


