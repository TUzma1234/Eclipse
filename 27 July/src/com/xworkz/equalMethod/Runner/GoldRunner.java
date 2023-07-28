package com.xworkz.equalMethod.Runner;
import com.xworkz.equalMethod.app.Gold;

public class GoldRunner {
	public static void main(String[] args) {
		System.out.println("Running main in GoldRunner");
		Gold gold = new Gold("Yellow Gold",621000,"necklace","Chain");
		Gold gold1 = new Gold("Yellow Gold",621000,"necklace","Chain");
		System.out.println(gold.equals(gold1));
	}

}


