package com.Xworkz.First;

public class Rope {
		int height;
		static String weight;
		static void displayStatic()
		{
			weight="23kg";
		}
		Rope(int height)
		{
			this.height=height;
		}
		void display()
		{
			System.out.println("Weight="+Rope.weight);
			System.out.println("height of rope="+this.height);
		}
}
