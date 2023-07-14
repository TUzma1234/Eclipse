package com.Xworkz.First;

public class Fabric {
		static String color;
		int price;
		static void dispayStatic()
		{
				color="Blue";
		}
		Fabric(int price)
		{
			this.price=price;
		}
		void display()
		{
				System.out.println("color of fabric"+Fabric.color);
				System.out.println("price of fabric="+this.price);
		}

}
