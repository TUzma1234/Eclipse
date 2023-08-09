package com.xworkz.abstraction.smartwatchrunner;


import com.xworkz.abstraction.app.Smartwatch.Panerai;

import com.xworkz.abstraction.app.Smartwatch.JacquelineFernandez;
import com.xworkz.abstraction.app.Smartwatch.SmartWatch;

public class SmartwatchRunner {
	
	public static void main(String[] args) {
		SmartWatch smart=new Panerai();
		smart.price();

		JacquelineFernandez jacqueline=new JacquelineFernandez(smart);
		jacqueline.showTime();

	}

}


