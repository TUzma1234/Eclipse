package com.inheritance;

public class Monkey extends Animal {
			boolean Wild;
			
			public Monkey(boolean Wild,String name,int age,String type,String food)
			{
				super(name,age,type,food);
				this.Wild=Wild;
				System.out.println("Running extends const");
				System.out.println("Wild="+this.Wild);
				System.out.println("name="+this.name);
				System.out.println("Age="+this.age);
				System.out.println("Type="+this.type);
				System.out.println("Food="+this.food);
				
				
				
			}

}
