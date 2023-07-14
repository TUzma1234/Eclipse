package com.Xworkz.First;

public class Wire {
	static String brand;
	String wireName;
	static void displayStatic()
	{
		brand="Polycab";
	}
	Wire(String wireName)
	{
		this.wireName=wireName;
	}
	void display()
	{
			System.out.println("wire brand="+Wire.brand);
			System.out.println("wire wireName="+this.wireName);
	
	
			
	}

}
