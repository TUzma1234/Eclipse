package com.xworkz.equalMethod.Runner;
import com.xworkz.equalMethod.app.Assets;

public class AssetsRunner {
	public static void main(String[] args) {
		System.out.println("Running main Method");
		Assets assets = new Assets("Ownership","Security","Fixed");
		Assets assets1= new Assets("Ownership", "Security", "Fixed");
		System.out.println(assets.equals(assets1));
	}

}


