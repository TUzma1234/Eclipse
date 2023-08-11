package com.xworkz.karnataka.app;

public class OlympicNameRepositoryImpl   implements OlympicNameRepository{
	private String[] year=new String[NAME_OLYMPIC];
	private int index=0;
	@Override
	public String name(String nameOfOlympics) {
		System.out.println("Invoking years in OlympicYearRepositoryImpl");
		if(index<NAME_OLYMPIC)
		{
			System.out.println("Index at="+this.index);
			this.year[index]=nameOfOlympics;
			System.out.println("Year at index ="+year[index]);
			index++;
			System.out.println("Index after increament="+this.index);
		}
		else
		{
			System.err.println("Index is exceeded,getting exception");
		}
		return 0;
	}
	public void display()
	{
		for(int starting=0;starting<year.length;starting++)
		{
			System.out.println("Year at index "+starting+" is ="+year[starting]);
		}
	}
}



 





