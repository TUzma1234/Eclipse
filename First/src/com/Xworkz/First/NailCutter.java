package com.Xworkz.First;

public class NailCutter {
		String brand;
		static int price;
		static void displayStatic()
		{
			price=250;
		}
		NailCutter(String brand)
		{
				this.brand=brand;
		}
		void display()
		{
				System.out.println("price="+NailCutter.price);
				System.out.println("NailCutter is brand="+this.brand);
		}
}
