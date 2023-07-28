package com.xworkz.equalMethod.Runner;
import com.xworkz.equalMethod.app.Grocery;

public class GroceryRunner {
	public static void main(String[]args)
	{
		System.out.println("Running main method");
		Grocery grocery1 = new Grocery("rice","BTM");
		Grocery grocery2 = new Grocery("kurkure","BTM");
		
		System.out.println("Object 1:\n"+ grocery1);
		System.out.println("Running the Grocery");
		System.out.println("Object 2:\n"+ grocery2);
		boolean result = grocery1.equals(grocery2);
		System.out.println("The Grocery is:"+result);
	}
	
}
		
		
