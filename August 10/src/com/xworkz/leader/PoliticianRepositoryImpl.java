package com.xworkz.leader;

public class PoliticianRepositoryImpl  implements PoliticianRepository{
	String[] names=new String[NUMBER_POLITICIAN];
	int index=0;

	@Override
	public void save(String name) {
		if(index<NUMBER_POLITICIAN)
		{

			System.out.println("The element stored at "+index+" is "+name);
			this.names[index]=name;
			index=index+1;
			System.out.println("The next index is "+index);
		}
		else
		{
			System.err.println("Array is full,can't store");
		}

	}
	@Override
	public void display()
	{
		for(int start=0;start<names.length;start++) {
			System.out.println("The element stored at "+start+" is "+names[start]);
		}
	}





} 


