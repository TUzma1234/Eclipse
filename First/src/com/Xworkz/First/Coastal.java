package com.Xworkz.First;

public class Coastal {
	static String coastalState;
	int noOfCoastalAreas;
	static void displayStatic()
	{
		coastalState="Kanara";
	}
	Coastal(int noOfCoastalAreas)
	{
			this.noOfCoastalAreas=noOfCoastalAreas;
	}
	void display()
	{
			System.out.println("coastalState="+Coastal.coastalState);
			System.out.println("No of coastal areas in karnataka="+this.noOfCoastalAreas);
	}

}
