package com.xworkz.toString.app;

public class Calculatorr {
	private String brand;
	private String type;
	private String name;
	private boolean allowed;
	private int operator;

	@Override
	public String toString() 
	{
		return "brand: " + brand +"\n"+ "type: " + type +"\n"+ "name: " + name +"\n"+ "allowed " + allowed +"\n"+ "operator " + operator;
	}

	public String getBrand()
	{
		return brand;
	}

	public String getTypeOf() 
	{
		return type;
	}

	public String getname()
	{
		return name;
	}

	public int getOperator()
	{
		return operator;
	}

	public boolean allowed() 
	{
		return allowed;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public void setTypeOf(String type) 
	{
		this.type = type;
	}

	public void setUsage(String name) 
	{
		this.name = name;
	}

	public void setAllowed(boolean allowed) 
	{
		this.allowed = allowed;
	}

	public void setOperations(int operator)
	{
		this.operator = operator;
	}
}


