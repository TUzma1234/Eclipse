package com.xworkz.abstraction.KidneyRunner;
import com.xworkz.abstraction.app.kidney.BodyKidney;
import com.xworkz.abstraction.app.kidney.Kidney;
import com.xworkz.abstraction.app.kidney.ZebaKidney;
public class KidneyRunner {
	
	
	public static void main(String[] args) {

		System.out.println("main of Kidney");

		Kidney kidney = new BodyKidney();
		ZebaKidney my = new ZebaKidney(kidney);
		my.check();

	}

}


