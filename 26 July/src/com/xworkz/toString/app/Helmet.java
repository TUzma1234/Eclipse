package com.xworkz.toString.app;

public class Helmet {
	private String brand;
	private String location;
	private int size; 
	private int cost;
	private String type;

	@Override
	public String toString() {

		return "brand: " + brand +"\n"+ "location: " + location +"\n"+ "size: " + size +"\n"+ "cost " + cost +"\n"+ "type " + type;
	}

	public String getBrand() {
		return brand;
	}

	public String getlocation() {
		return location;
	}

	public int getsize() {
		return size;
	}

	public int getcost() {
		return cost;
	}

	public String gettype() {
		return type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setlocation(String location) {
		this.location = location;
	}

	public void setsize(int size) {
		this.size = size;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setType(String type) {
		this.type = type;
	}

}


