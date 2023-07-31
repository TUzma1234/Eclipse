package com.xworkz.inheritance.app;

public final class Letter extends PostBox{
	
	public static void cast(PostBox ps)
	
	{
		if(ps instanceof Letter)
		{
			Letter r =(Letter) ps;
			System.out.println("Letter is a collection of postbox");
		}
		else
		{
			System.out.println("Not an instance");
		}
	}
	
	
		public static void Transmission()
		{
			System.out.println("Method of final class cannot be extended");
			
		
	}
}
