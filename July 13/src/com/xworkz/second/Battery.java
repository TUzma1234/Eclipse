package com.xworkz.second;

public class Battery {
		String name;
		int capacity=250;
		String voltage;
		BatteryType type;
		
		Battery(String name)
		{
			this.name=name;
		}
		void voltage (int voltage)
		{
			this.voltage="100v";
		}
		void display()
		{
				System.out.println("Battery name="+this.name);
				System.out.println("Battery capacity="+this.capacity);
				System.out.println("Battery voltage="+this.voltage);
				System.out.println("Battery Type="+this.type);
				
		}
		
		
		
		
		
		

}
