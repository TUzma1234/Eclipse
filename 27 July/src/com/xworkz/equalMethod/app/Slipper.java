package com.xworkz.equalMethod.app;

public class Slipper {
	private String name;
	private String location;
	private String brand;
	private int size;
	private String type;
	private String design;
	private int cost;

	public Slipper(String name, String location, String brand, int size, String type, String design,
			int cost) {
		super();
		this.name = name;
		this.location = location;
		this.brand = brand;
		this.size = size;
		this.type = type;
		this.design = design;
		this.cost = cost;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Obj is not null");
			if (obj instanceof Slipper) {
				System.out.println(this);
				System.out.println(obj);
				Slipper ref = (Slipper) obj;
				if (this.name == ref.name && this.location == ref.location && this.brand == ref.brand
						&& this.size == ref.size && this.type == ref.type && this.design == ref.design
						&& this. cost == ref. cost) {
					System.out.println("Both are same");
					return true;
				} else {
					System.out.println("Both are  not same");
				}
			} else {
				System.out.println("it is obj not instance of grocery");
			}
		} else {
			System.out.println("obj is null");
		}
		return false;
	}
}

