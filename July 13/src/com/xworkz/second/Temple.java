package com.xworkz.second;

public class Temple {
		String godName;
		int hour;
		String location;
		TempleName nameOfTemple;
		Temple(TempleName nameOfTemple)
		{
			this.nameOfTemple=nameOfTemple;
		}
		void time(int hour)
		{
			this.hour=hour;
		}
		void display()
		{
			System.out.println("God Name="+this.godName);
			System.out.println("Hour="+this.hour);
			System.out.println("location="+this.location);
			System.out.println("Temple name="+this.nameOfTemple);
		
		}
		

}
