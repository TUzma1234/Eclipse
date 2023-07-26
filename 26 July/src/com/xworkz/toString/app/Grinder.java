package com.xworkz.toString.app;

public class Grinder {
	private String LG;
	private int volt;
	private double rpm;
	private int price;
	private String material;

	@Override
	public String toString() {

		return "name" + LG +"\n"+ "volt: " + volt +"\n"+ "rpm: " + rpm +"\n"+ "price " + price +"\n"+ "material " + material;
	}

	public String getname() {
		return LG;
	}

	public int getvolt() {
		return volt;
	}

	public double getrpm() {
		return rpm;
	}

	public int getprice() {
		return price;
	}

	public String getMaterial() {
		return material;
	}

	public void setname(String name) {
		this.LG = name;
	}

	public void setvolt(int volt) {
		this.volt = volt;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

}
