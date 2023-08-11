package com.xworkz.suport;

public class OlympicRepositoryImpl implements OlympicRepository {
	int[] years=new int[NUMBER_PLAYERS];
	int index=0;

	@Override
	public void save(int year) {
		if(index<NUMBER_PLAYERS)
		{

			System.out.println("The element stored at "+index+" is " +year);
			this.years[index]=year;
			index=index+1;
			System.out.println("The next index is "+index);
		}
		else {
			System.out.println("Array is full,can't store");
		}

	}
	@Override
	public void display()
	{
		for(int start=0;start<years.length;start++) {
			System.out.println("The element stored at "+start+" is "+years[start]);
		}
	}




	}
