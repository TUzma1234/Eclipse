package com.xworkz.interfaces.app.saloon;

import com.xworkz.interfaces.app.*;

public class CustomerSaloonRule implements SaloonRule {
	

		@Override
		public void hairCut() {
			System.out.println("Running harcut in CustomersSaloonRule");
		}

}
