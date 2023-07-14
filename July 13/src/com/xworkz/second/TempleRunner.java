package com.xworkz.second;

public class TempleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temple temple=new Temple(TempleName.Hanuman);
		temple.godName="Hanuman";
		temple.time(8);
		temple.display();
		
		
		Temple temple1=new Temple(TempleName.Virupaksha);
		temple1.godName="Virupaksha";
		temple1.time(5);
		temple1.display();
	}

}
