package com.xworkz;

public class FamilyCourt extends CivilCourt {
	@Override
	
	void propertyCase()
	{
		
			System.out.println("invoking the propertyCase in the FamilyCourt");
	}
	
	@Override
	void theftCase()
	{
			System.out.println("invoking the theftCase in the familyCase");
	}
	
	void divorce()
	{
		System.out.println("invoking divorce in FamilyCourt");
		
	}

}
