package com.xworkz.Runner;

import com.xworkz.Implementation.*;

public class FashionRunner {
	public static void main(String[] args) {
		Designer saree = new Designer();
		saree.display();
		saree.buy();
		saree.wear();

		FashionShow bag = new FashionShow();
		bag.display();
		bag.buy();

	}

	

}
