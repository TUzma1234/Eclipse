package com.xworkz;

public class HighCourt extends SupremeCourt {
	
	
	@Override
	void importantCase()
	{
			System.out.println("invoking importantCase in the HighCourt");
	}
	
	void criminalCase()
	{
			System.out.println("invoking the criminalCase in the HighCourt");
			
	}
	void forgeryCase()
	{
		
			System.out.println("invoking the forgeryCase in the HighCourt");
	}

}
