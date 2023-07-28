package com.xworkz.equalMethod.app;

public class Gold {
	private String type;
	private double price;
	private String name;
	private String design;

	public Gold(String type , double price , String name , String design) {
		super();
		this.type = type;
		this.price = price;
		this.name = name;
		this.design = design;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Gold) {
				System.out.println(this);
				System.out.println(obj);
				Gold gold = (Gold) obj;
				if (this.type == gold.type && this.price == gold.price && this.name == gold.name
						&& this.design == gold.design) {
					System.out.println("Both are same");
					return true;
				} else {
					System.err.println("Both are not same");
				}
			} else {
				System.err.println("Object is not null");
			}
		} else {
			System.err.println("Object is null");
		}
		return false;
	}
}


