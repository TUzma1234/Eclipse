package com.Xworkz.First;

public class Vaccum {
		static int price;
		String brand;
		static void displayStatic()
		{
			price=76000;
		}
		Vaccum(String brand)
		{
			this.brand=brand;
		}
		void display()
		{
				System.out.println("price of vaccum="+Vaccum.price);
				System.out.println("Brand of vaccum="+this.brand);
		}
}
