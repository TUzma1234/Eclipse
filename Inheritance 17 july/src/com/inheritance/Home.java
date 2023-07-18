package com.inheritance;

public class Home extends Building {
	   String location;
	   
	   public Home(String location,String name,int height,double width)
	   {
		   super(name,height,width);
		   this.location=location;
		   System.out.println("Running  arg is const");
		   System.out.println("Location="+this.location);
		   System.out.println("Name="+this.name);
		   System.out.println("Height="+this.height);
		   System.out.println("Width="+this.width);
		   
	   }
	

}

