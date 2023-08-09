package com.xworkz.mobile;

public class MobileRunner {
	
	public static void main(String[] args) {
		Vivo vivo=new Oppo();
		vivo.location();
		vivo.price();

		Samsung samsung=new Oppo();
		samsung.price();
		samsung.location();
		samsung.nameOfcampany();

		Realme me=new Oppo();
		me.realme();
		me.price();
		me.location();

		Oppo oppo=new Oppo();
	    oppo.realme();
		oppo.price();
		oppo.nameOfcampany();
		oppo.location();

	}

}


