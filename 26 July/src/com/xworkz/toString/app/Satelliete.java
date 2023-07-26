package com.xworkz.toString.app;

public class Satelliete {
	private String name;
	private String launchDate;
	private int valuation;
	private boolean Successfull;
	private String date;

	@Override
	public String toString() {

		return "name: " + name +"\n"+ "launchDate: " + launchDate +"\n"+ "valuation: " + valuation +"\n"+ "Successfull " + Successfull +"\n"+ "date " + date;
	}

	public String getName() {
		return name;
	}

	public String getLaunchDate() {
		return launchDate;
	}

	public int getValuation() {
		return valuation;
	}

	public String getDate() {
		return date;
	}

	public boolean getSuccessfull() {
		return Successfull;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}

	public void setValuation(int valuation) {
		this.valuation = valuation;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setSuccessfull(boolean Successfull) {
		this.Successfull = Successfull;
	}
}


