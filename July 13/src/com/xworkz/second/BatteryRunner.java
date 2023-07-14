package com.xworkz.second;

public class BatteryRunner {
		public static void main(String[] args) {
			Battery ref=new Battery("Lithiumion");
			ref.type=BatteryType.Lithiumion;
			ref.capacity=250;
			ref.display();
			
				Battery ref1=new Battery("polymer battery");
				ref1.type=BatteryType.Lead;
				ref1.capacity=50;
				ref1.display();
			}
}
