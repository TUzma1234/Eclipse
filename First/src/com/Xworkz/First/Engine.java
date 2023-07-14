package com.Xworkz.First;

public class Engine {
		static boolean name;
		String vehicleName;
		static void displayStatic()
		{
				name=false;
		}
		Engine(String vehicleName)
		{
			this.vehicleName=vehicleName;
		}
		void display()
		{
				System.out.println("engine name="+Engine.name);
				System.out.println("VehicleName="+this.vehicleName);
		}
}
