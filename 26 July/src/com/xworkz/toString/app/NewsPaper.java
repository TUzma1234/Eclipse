package com.xworkz.toString.app;

public class NewsPaper {
	private String name;
	private int price;
	private int noOfPages;
	private String location;
	private String type;

	@Override
	public String toString() {

		return "name: " + name +"\n"+ "price: " + price +"\n"+ "noOfPages: " + noOfPages +"\n"+ "location " + location +"\n"+ "type " + type;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getnoOfPages() {
		return noOfPages;
	}

	public String location() {
		return location;
	}

	public String type() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setnoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public void setlocation(String location) {
		this.location = location;
	}

	public void settype(String type) {
		this.type = type;
	}
}


