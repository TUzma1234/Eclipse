package com.xworkz.toString.app;
import com.xworkz.toString.app.*;

public class ClassRunner {
	public static void main(String[] args) {

		System.out.println("running main of Dosa");
		Dosa dosa = new Dosa();
		System.out.println(dosa);
		dosa.setname("masala");
		dosa.setcost(50);
		dosa.setTasty(true);
		dosa.setLocation("BTM");
		System.out.println();
		System.out.println("printing values of Dosa properties");
		System.out.println(dosa);
		System.out.println();

		System.out.println("running main of Satellite");
		Satelliete satellite = new Satelliete();
		System.out.println(satellite);
		satellite.setName("chandrayan");
		satellite.setLaunchDate("srihariKota");
		satellite.setDate("10-july");
		satellite.setSuccessfull(true);
		satellite.setValuation(250);
		System.out.println("printing values of Satellite properties");
		System.out.println(satellite);
		System.out.println();

		System.out.println("running main of Calculatorr");
		Calculatorr calci=new Calculatorr();
		System.out.println(calci);
		calci.setBrand("casio");
		calci.setTypeOf("scientific");
		calci.setUsage("calculations");
		calci.setAllowed(false);
		calci.setOperations(80);
		System.out.println();
		System.out.println("printing values of calculator properties");
		System.out.println(calci);
		System.out.println();

		System.out.println("running main of NewsPaper");
		NewsPaper paper = new NewsPaper();
		System.out.println(paper);
		paper.setName("kannada");
		paper.setPrice(30);
		paper.setnoOfPages(24);
		paper.setlocation("Bijapur");
		paper.settype("Vijaya vani");
		System.out.println();
		System.out.println("printing values of NewsPaper properties");
		System.out.println(paper);
		System.out.println();

		System.out.println("running main of HeadSet");
		HeadSet set = new HeadSet();
		System.out.println(set);
		set.setname("Boat");
		set.setCompany("Iphone");
		set.setprice(2000);
		set.setcost(1500);
		set.setBluetooth(true);
		System.out.println();
		System.out.println("printing values of HeadSet properties");
		System.out.println(set);
		System.out.println();

		System.out.println("running main of Helmet");
		Helmet helmet = new Helmet();
		System.out.println(helmet);
		helmet.setBrand("steelBird");
		helmet.setlocation("Majestic");
		helmet.setsize(10);
		helmet.setCost(3000);
		helmet.setType("face");
		System.out.println();
		System.out.println("printing values of Helmet properties");
		System.out.println(helmet);
		System.out.println();

		System.out.println("running main of tap");
		Tap tap = new Tap();
		System.out.println(tap);
		tap.setType("wash");
		tap.setname("sliver");
		tap.setlocation("office");
		tap.setbrand("somany");
		tap.setWarranty(2);
		System.out.println();
		System.out.println("printing values of tap properties");
		System.out.println(tap);
		System.out.println();

		System.out.println("running main of Grinder");
		Grinder grind = new Grinder();
		System.out.println(grind);
		grind.setname("LG");
		grind.setvolt(380);
		grind.setRpm(220);
		grind.setprice(50000);
		grind.setMaterial("bronze");
		System.out.println();
		System.out.println("printing values of tap properties");
		System.out.println(tap);
		System.out.println();

	}

}


