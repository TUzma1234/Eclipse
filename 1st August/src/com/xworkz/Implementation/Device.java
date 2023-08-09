package com.xworkz.Implementation;
import com.xworkz.Abstraction.Mobile;

public class Device extends Mobile {
	public final void Realme() {
		System.out.println("Making a call...");
	}

	@Override
	public void Switchon() {
		System.out.println("Mobile phone powered on.");
	}

}
