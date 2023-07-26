package com.xworkz.toString.app;

public class Dosa {
	private String name;
	private int cost;
	private boolean tasty;
	private String type;
	private String location;

	@Override
	public String toString() {

		return "name: " + name +"\n"+ "cost: " + cost +"\n"+ "Tasty: " + tasty +"\n"+ "type " + type +"\n"+ "location " + location;
	}

	public String getname() {
		return name;
	}

	public int getCost() {
		return cost;
	}

	public boolean getTasty() {
		return tasty;
	}

	public String geType() {
		return type;
	}

	public String getLocation() {
		return location;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setcost(int cost) {
		this.cost = cost;
	}

	public void settype(String type) {
		this.type = type;
	}

	public void setTasty(boolean tasty) {
		this.tasty = tasty;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}


