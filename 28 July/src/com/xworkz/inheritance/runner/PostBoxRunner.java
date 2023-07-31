package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.app.Office;
import com.xworkz.inheritance.app.Letter;

import com.xworkz.inheritance.app.PostBox;

public class PostBoxRunner {

	public static void main(String[] args) {
		PostBox ps = new Letter();
		ps.gets();
		Letter.cast(ps);
		
		Letter r = new Letter();
		r.finalMetod();
		
		Office office = new Office();
		office.printInfo();;
	

	}

}
