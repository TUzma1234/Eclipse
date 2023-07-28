package com.xworkz.equalMethod.app;

public class Grocery {
	private String name;
	private String location;
	public Grocery (String name,String location)
	{
		super();
		this.name=name;
		this.location=location;
	}
	public String getName()
	{
		return name;
	}
	public String location()
	{
		return location;
	}
	public void StringName(String name)
	{
		this.name=name;
	}
	public void Stringlocation(String location)
	{
		this.location=location;
	}

	@Override
	public String toString()
	{
			return "GroceryName=" +name +"\n" + "location=" + location;
	}
		@Override
		public boolean equals(Object obj)
		{
			if(obj!=null)
			{
				System.out.println("Object is not null ");
				if(obj instanceof Grocery)
				{
					System.out.println("Object is matched");
					Grocery casted = (Grocery)obj;
					if(this.name ==casted.name )
						if(this.location ==casted.location)
						{
							System.out.println("Both the objects are same");
							return true;
						}
						else
						{
							System.out.println("Both the objects are not same");
						}
				}
				else
				{
					System.out.println("Object is not matched");
				}
			}
			else 
			{
				System.out.println("Object is null");
			}
					return false;
		}
}
				
			
					
