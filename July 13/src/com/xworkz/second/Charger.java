package com.xworkz.second;

public class Charger {
		int price;
		String brand;
		String companyName;
		int length;
		Charger(int price)
		{
			this.price=price;
		}
		void chargerlength(int length)
		{
			this.length=length;
		}
		void display()
		{
			System.out.println("Charger price="+this.price);
			System.out.println("Charger brand="+this.brand);
			System.out.println("Charger companyName="+this.companyName);
			System.out.println("Charger length="+this.length);
			
		}
		
		

}
