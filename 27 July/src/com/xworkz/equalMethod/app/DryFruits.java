package com.xworkz.equalMethod.app;

public class DryFruits {
	private String name;
	private String type;
	private String location;
	private String brand;
	private int cost;
	private double weight;

	public DryFruits(String name, String type, String location, String brand, int cost,
			double weight) {
		super();
		this.name = name;
		this.type = type;
		this.location = location;
		this.brand = brand;
		this.cost = cost;
		this.weight = weight;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Obj is not null");
			if (obj instanceof DryFruits) {
				System.out.println(this);
				System.out.println(obj);
				DryFruits dryfruits = (DryFruits) obj;
				if (this.name == dryfruits.name && this.type == dryfruits.type
						&& this.location == dryfruits.location && this.brand == dryfruits.brand && this.cost == dryfruits.cost
						&& this.weight == dryfruits.weight) {
					System.out.println("Both are same");
					return true;
				} else {
					System.out.println("Both are  not same");
				}
			} else {
				System.out.println("It is obj not instance ");
			}
		} else {
			System.out.println("obj is null");
		}
		return false;
	}
}


