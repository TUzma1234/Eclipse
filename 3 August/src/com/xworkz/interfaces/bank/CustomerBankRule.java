package com.xworkz.interfaces.bank;
import com.xworkz.interfaces.*;

public class CustomerBankRule implements BankRule {
	
	@Override
	public void loan() {
		System.out.println("Running loan in CustomerBankRule");
	}

}
