package com.xworkz.inheritance.app;

public class PostBox {
	final double noOfletter;
	
	public void gets()
	{
		System.out.println("So many types of PostBox");
		
		// noOfletter =300; shows error
	}
	
		public 	PostBox()
		{
			this.noOfletter= 500;
			System.out.println("final initialize noOfletter:" + noOfletter);
		}
		public final void finalMetod()
		{
			System.out.println("final method ofPostBox");
		}

}
