package com.xworkz.second;

public class ResortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resort resort=new Resort("Seahorizon");
		resort.food("Dosa-Briyani");
		resort.roomType=TypeOfResort.Exploit_Resorts;
		resort.display();
		Resort resort1=new Resort("Blue woods resort");
		resort1.food("Chappti-Chicken65");
		resort1.roomType=TypeOfResort.Golf_Resorts;
		resort1.display();
	}

}
