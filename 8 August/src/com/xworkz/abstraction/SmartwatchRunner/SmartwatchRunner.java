package com.xworkz.abstraction.SmartwatchRunner;

import com.xworkz.abstraction.app.smartwatch.DigitalWatch;
import com.xworkz.abstraction.app.smartwatch.FastTrack;
import com.xworkz.abstraction.app.smartwatch.SmartWatch;

public class SmartwatchRunner {
	
	

	public static void main(String[] args) {
		System.out.println("main of SmartWatch");
		SmartWatch smart = new DigitalWatch();
		FastTrack fast = new FastTrack(smart);
		fast.check();

	}

}


