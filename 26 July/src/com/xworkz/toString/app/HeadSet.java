package com.xworkz.toString.app;

public class HeadSet {
	private String name;
	private String company;
	private int price;
	private boolean bluetooth;
	private int cost;

	@Override
	public String toString() {

		return "name: " + name +"\n"+ "company: " + company +"\n"+ "price: " + price +"\n"+ "bluetooth " + bluetooth +"\n"+ "cost " + cost;
	}

	public String name() {
		return name;
	}

	public String company() {
		return company;
	}

	public int getprice() {
		return price;
	}

	public boolean bluetooth() {
		return bluetooth;
	}

	public int getcost() {
		return cost;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setcost(int cost) {
		this.cost = cost;
	}
}

