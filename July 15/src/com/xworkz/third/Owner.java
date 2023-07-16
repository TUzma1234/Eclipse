package com.xworkz.third;

public class Owner {
	String name;
	int phoneNumber;
	int age;
	String address;
	String houseName;
	Owner(String name,int phoneNumber,int age,String address,String houseName)
	{
			this.name=name;
			this.phoneNumber=phoneNumber;
			this.age=age;
			this.address=address;
			this.houseName=houseName;
	}
	void printInfo()
	{
				System.out.println("Name="+this.name);
				System.out.println("Ag=e"+this.age);
				System.out.println("Phone Number="+this.phoneNumber);
				System.out.println("Int="+this.age);
				System.out.println("Address="+this.address);
				System.out.println("House Name="+this.houseName);
	}
	

}
