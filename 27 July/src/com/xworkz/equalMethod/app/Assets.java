package com.xworkz.equalMethod.app;

public class Assets {
	private String properties;
	private String name;
	private String type;

	public Assets(String properties, String name, String type) {
		super();
		this.properties = properties;
		this.name = name;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Assets) {
				System.out.println(this);
				System.out.println(obj);
				Assets asset = (Assets) obj;
				if (this.properties == asset.properties && this.name == asset.name
						&& this.type == asset.type) {
					System.out.println("Both are equal");
					return true;
				} else {
					System.err.println("Both are not same");
				}

			} else {
				System.err.println("Object is not null");
			}
		} else {
			System.err.println("object is null");
		}
		return false;
	}
}

	
			
			
				
			
				
				
			
