package com.inheritance;

public class Animal {
	String name;
	int age;
	String type;
	String food;
	
	Animal(String name,int age,String type,String food)
	{
		System.out.println("Running animal is const");
		this.name=name;
		this.age=age;
		this.type=type;
		this.food=food;
		System.out.println("Name="+this.name);
		System.out.println("Age="+this.age);
		System.out.println("Type="+this.type);
		System.out.println("Food="+this.food);
	}

}
