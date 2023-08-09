package com.xworkz.abstraction.Runner;


import com.xworkz.abstraction.app.printingmachine.Epson;
import com.xworkz.abstraction.app.printingmachine.PaperPrinter;
import com.xworkz.abstraction.app.printingmachine.PrintingMachine;



public class PrinterRunner {
	

	
	public static void main(String[] args) {

		System.out.println("main of PrinterRunner");
		PrintingMachine printing = new Epson();

		PaperPrinter paper = new PaperPrinter(printing);
		paper.check();
	}
}




