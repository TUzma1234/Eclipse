package com.xworkz.interfaces.vtu;
import com.xworkz.interfaces.*;

public class StudentsVtuRule implements VtuRule {
	
	@Override
	public void attendance() {
		System.out.println("Running attendance in StudentsVtuRule");
	}


}
