package com.xworkz;

public class CivilCourt extends HighCourt {
	@Override
	void criminalCase()
	{
			System.out.println("invoking the criminalCase is CivilCase");
	}
	void forgeryCase()
	{
		System.out.println("invoking the forgeryCase is CivilCourt");
	}
	void propertyCase()
	{
			System.out.println("invoking the propertyCase is CivilCourt");
	}
	
	void theftCase()
	{
		
	}

}
